package com.github.dingtalk.minapp.enums;

/**
 * storage类型.
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
public enum StorageType {
  /**
   * 内存.
   */
  Memory,
  /**
   * redis(JedisClient).
   */
  Jedis,
  /**
   * redis(RedisTemplate).
   */
  RedisTemplate
}
