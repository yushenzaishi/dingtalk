package com.github.dingtalk.minapp.config;

import java.util.concurrent.locks.Lock;

/**
 * 配置
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
public interface DtAppConfig {

  /**
   * Gets access token.
   *
   * @return the access token
   */
  String getAccessToken();

  /**
   * Gets access token lock.
   *
   * @return the access token lock
   */
  Lock getAccessTokenLock();

  /**
   * Is access token expired boolean.
   *
   * @return the boolean
   */
  boolean isAccessTokenExpired();

  /**
   * 强制将access token过期掉
   */
  void expireAccessToken();

  /**
   * 应该是线程安全的
   *
   * @param accessToken 要更新的WxAccessToken对象
   */
  //void updateAccessToken(WxAccessToken accessToken);

  /**
   * 应该是线程安全的
   *
   * @param accessToken      新的accessToken值
   * @param expiresInSeconds 过期时间，以秒为单位
   */
  void updateAccessToken(String accessToken, long expiresInSeconds);

  /**
   * Gets appid.
   *
   * @return the appid
   */
  String getAppKey();

  /**
   * Gets secret.
   *
   * @return the secret
   */
  String getAppSecret();

  /**
   * Gets expires time.
   *
   * @return the expires time
   */
  long getExpiresTime();

}
