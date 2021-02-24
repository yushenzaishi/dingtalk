package com.github.dingtalk.minapp.config.impl;

import com.github.dingtalk.minapp.redis.DtRedisOps;

import java.util.concurrent.TimeUnit;

/**
 * 基于redis存储的配置类
 * @author yuhaoda
 * @date 2021-02-04
 */
public class DtAppRedisBetterConfigImpl extends DtAppDefaultConfigImpl {
  private static final String ACCESS_TOKEN_KEY_TPL = "%s:access_token";
  private static final String LOCK_KEY_TPL = "%s:lock";

  private final DtRedisOps redisOps;

  private volatile String accessTokenKey;
  private volatile String lockKey;

  public DtAppRedisBetterConfigImpl(DtRedisOps redisOps) {
    this.redisOps = redisOps;
  }

  @Override
  public void setAppKey(String appKey) {
    super.setAppKey(appKey);
    this.accessTokenKey = String.format(ACCESS_TOKEN_KEY_TPL, appKey);
    this.lockKey = String.format(LOCK_KEY_TPL, appKey);
    super.accessTokenLock = this.redisOps.getLock(lockKey.concat("accessTokenLock"));
  }

  //------------------------------------------------------------------------
  // token相关
  //------------------------------------------------------------------------
  @Override
  public String getAccessToken() {
    return redisOps.getValue(this.accessTokenKey);
  }

  @Override
  public boolean isAccessTokenExpired() {
    Long expire = redisOps.getExpire(this.accessTokenKey);
    return expire == null || expire < 2;
  }

  @Override
  public synchronized void updateAccessToken(String accessToken, long expiresInSeconds) {
    redisOps.setValue(this.accessTokenKey, accessToken, expiresInSeconds - 200, TimeUnit.SECONDS);
  }

  @Override
  public void expireAccessToken() {
    redisOps.expire(this.accessTokenKey, 0, TimeUnit.SECONDS);
  }

}
