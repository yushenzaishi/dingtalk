package com.github.dingtalk.minapp.properties;

import lombok.Data;

/**
 * redis 配置.
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
@Data
public class RedisProperties {

  /**
   * 主机地址.不填则从spring容器内获取JedisPool
   */
  private String host;

  /**
   * 端口号.
   */
  private int port = 6379;

  /**
   * 密码.
   */
  private String password;

  /**
   * 超时.
   */
  private int timeout = 2000;

  /**
   * 数据库.
   */
  private int database = 0;

  private Integer maxActive;
  private Integer maxIdle;
  private Integer maxWaitMillis;
  private Integer minIdle;
}
