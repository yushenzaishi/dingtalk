package com.github.dingtalk.minapp.redis;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * 微信Redis相关操作
 * <p>
 * 该接口不承诺稳定, 外部实现请继承{@link BaseWxRedisOps}
 *
 * @see RedisTemplateDtRedisOps redisTemplate实现
 */
public interface DtRedisOps {

  String getValue(String key);

  void setValue(String key, String value, long expire, TimeUnit timeUnit);

  Long getExpire(String key);

  void expire(String key, int expire, TimeUnit timeUnit);

  Lock getLock(String key);
}
