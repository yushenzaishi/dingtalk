package com.github.dingtalk.minapp.config.impl;

import com.github.dingtalk.minapp.config.DtAppConfig;
import lombok.Getter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 基于内存的微信配置provider，在实际生产环境中应该将这些配置持久化
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
@Getter
public class DtAppDefaultConfigImpl implements DtAppConfig {
  protected volatile String appKey;

  protected Lock accessTokenLock = new ReentrantLock();

  private volatile String appSecret;
  private volatile String accessToken;
  private volatile long expiresTime;

  /**
   * 会过期的数据提前过期时间，默认预留200秒的时间
   */
  protected long expiresAheadInMillis(long expiresInSeconds) {
    return System.currentTimeMillis() + (expiresInSeconds - 200) * 1000L;
  }

  /**
   * 判断 expiresTime 是否已经过期
   */
  protected boolean isExpired(long expiresTime) {
    return System.currentTimeMillis() > expiresTime;
  }

  @Override
  public String getAccessToken() {
    return this.accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public Lock getAccessTokenLock() {
    return this.accessTokenLock;
  }

  public void setAccessTokenLock(Lock accessTokenLock) {
    this.accessTokenLock = accessTokenLock;
  }

  @Override
  public boolean isAccessTokenExpired() {
    return isExpired(this.expiresTime);
  }


  @Override
  public synchronized void updateAccessToken(String accessToken, long expiresInSeconds) {
    setAccessToken(accessToken);
    setExpiresTime(expiresAheadInMillis(expiresInSeconds));
  }


  @Override
  public void expireAccessToken() {
    this.expiresTime = 0;
  }

  @Override
  public String getAppSecret() {
    return this.appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  @Override
  public long getExpiresTime() {
    return this.expiresTime;
  }

  public void setExpiresTime(long expiresTime) {
    this.expiresTime = expiresTime;
  }

  @Override
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }
}
