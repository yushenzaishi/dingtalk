package com.github.dingtalk.minapp.api;

import com.github.dingtalk.minapp.config.DtAppConfig;
import java.util.Map;

/**
 * The interface Wx ma service.
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
public interface DtAppService {
  /**
   * 钉钉网关gettoken地址
   */
  public static final String URL_GET_TOKKEN = "https://oapi.dingtalk.com/gettoken";

  /**
   * 获取access_token, 不强制刷新access_token.
   *
   * @return the access token
   * @see #getAccessToken(boolean) #getAccessToken(boolean)
   */
  String getAccessToken();

  /**
   * <pre>
   * 获取access_token，本方法线程安全.
   * 且在多线程同时刷新时只刷新一次，避免超出2000次/日的调用次数上限
   *
   * 另：本service的所有方法都会在access_token过期时调用此方法
   *
   * 程序员在非必要情况下尽量不要主动调用此方法
   *
   * 详情请见: http://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140183&token=&lang=zh_CN
   * </pre>
   *
   * @param forceRefresh 强制刷新
   * @return the access token
   */
  String getAccessToken(boolean forceRefresh);


  /**
   * <pre>
   * 设置当钉钉系统响应系统繁忙时，要等待多少 retrySleepMillis(ms) * 2^(重试次数 - 1) 再发起重试.
   * 默认：1000ms
   * </pre>
   *
   * @param retrySleepMillis 重试等待毫秒数
   */
  void setRetrySleepMillis(int retrySleepMillis);

  /**
   * <pre>
   * 设置当钉钉系统响应系统繁忙时，最大重试次数.
   * 默认：5次
   * </pre>
   *
   * @param maxRetryTimes 最大重试次数
   */
  void setMaxRetryTimes(int maxRetryTimes);

  /**
   * DtAppConfig 对象.
   *
   */
  DtAppConfig getDtAppConfig();

  /**
   * 注入 {@link DtAppConfig} 的实现.
   *
   * @param dtAppConfig config
   */
  void setDtAppConfig(DtAppConfig dtAppConfig);


  void setMultiConfigs(Map<String, DtAppConfig> configs);

  void setMultiConfigs(Map<String, DtAppConfig> configs, String defaultAppKey);

  DtAppUserService getUserService();

}
