package com.github.dingtalk.minapp.api.impl;

import com.dingtalk.api.response.OapiGettokenResponse;
import com.github.dingtalk.minapp.api.DtAppService;
import com.github.dingtalk.minapp.api.DtAppV2UserService;
import com.github.dingtalk.minapp.config.DtAppConfig;
import com.github.dingtalk.minapp.exception.DtRuntimeException;
import com.github.dingtalk.minapp.util.DtAppConfigHolder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * @author yuhaoda
 * @date 2021-02-04
 */
@Slf4j
public abstract class BaseDtAppServiceImpl implements DtAppService {
  protected static final Gson GSON = new Gson();
  private final DtAppV2UserService userService = new DtAppV2UserServiceImpl(this);
  private Map<String, DtAppConfig> configMap;
  private int retrySleepMillis = 1000;
  private int maxRetryTimes = 5;

  @Override
  public String getAccessToken(){
    return getAccessToken(false);
  }

  @Override
  public String getAccessToken(boolean forceRefresh) {
    if (!forceRefresh && !this.getDtAppConfig().isAccessTokenExpired()) {
      return this.getDtAppConfig().getAccessToken();
    }

    Lock lock = this.getDtAppConfig().getAccessTokenLock();
    boolean locked = false;
    try {
      do {
        locked = lock.tryLock(100, TimeUnit.MILLISECONDS);
        if (!forceRefresh && !this.getDtAppConfig().isAccessTokenExpired()) {
          return this.getDtAppConfig().getAccessToken();
        }
      } while (!locked);
      OapiGettokenResponse response = doGetAccessTokenRequest();
      return extractAccessToken(response);
    } catch (ApiException | InterruptedException e) {
      throw new DtRuntimeException(e);
    } finally {
      if (locked) {
        lock.unlock();
      }
    }
  }

  /**
   * 通过网络请求获取AccessToken
   *
   * @return .
   * @throws IOException .
   */
  protected abstract OapiGettokenResponse doGetAccessTokenRequest() throws ApiException;

  /**
   * 设置当前的AccessToken
   *
   * @param response 响应内容
   * @return access token
   */
  protected String extractAccessToken(OapiGettokenResponse response){
    DtAppConfig config = this.getDtAppConfig();
    if (response.getErrcode()!=0) {
      throw new DtRuntimeException(response.getErrmsg());
    }
    config.updateAccessToken(response.getAccessToken(), response.getExpiresIn());
    return response.getAccessToken();
  }

  @Override
  public DtAppConfig getDtAppConfig() {
    if (this.configMap.size() == 1) {
      // 只有一个app，直接返回其配置即可
      return this.configMap.values().iterator().next();
    }

    return this.configMap.get(DtAppConfigHolder.get());
  }

  @Override
  public void setDtAppConfig(DtAppConfig appConfig) {
    final String appKey = appConfig.getAppKey();
    this.setMultiConfigs(ImmutableMap.of(appKey, appConfig), appKey);
  }

  @Override
  public void setMultiConfigs(Map<String, DtAppConfig> configs) {
    this.setMultiConfigs(configs, configs.keySet().iterator().next());
  }

  @Override
  public void setMultiConfigs(Map<String, DtAppConfig> configs, String defaultAppKey) {
    this.configMap = Maps.newHashMap(configs);
    DtAppConfigHolder.set(defaultAppKey);
  }

  @Override
  public void setRetrySleepMillis(int retrySleepMillis) {
    this.retrySleepMillis = retrySleepMillis;
  }

  @Override
  public void setMaxRetryTimes(int maxRetryTimes) {
    this.maxRetryTimes = maxRetryTimes;
  }

  @Override
  public DtAppV2UserService getUserService() {
    return this.userService;
  }


}
