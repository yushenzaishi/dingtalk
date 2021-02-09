package com.github.dingtalk.minapp.properties;


import com.github.dingtalk.minapp.enums.HttpClientType;
import com.github.dingtalk.minapp.enums.StorageType;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * 属性配置类.
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
@Data
@ConfigurationProperties(prefix = "dt.app")
public class DtAppProperties {
  /**
   * 设置微信小程序的appid.
   */
  private String appKey;

  /**
   * 设置微信小程序的Secret.
   */
  private String appSecret;


}
