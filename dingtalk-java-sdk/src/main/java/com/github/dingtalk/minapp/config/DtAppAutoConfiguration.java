package com.github.dingtalk.minapp.config;


import com.github.dingtalk.minapp.api.DtAppService;
import com.github.dingtalk.minapp.api.impl.DtAppServiceHttpClientImpl;
import com.github.dingtalk.minapp.config.impl.DtAppDefaultConfigImpl;
import com.github.dingtalk.minapp.config.impl.DtAppRedisBetterConfigImpl;
import com.github.dingtalk.minapp.properties.DtAppProperties;
import com.github.dingtalk.minapp.redis.DtRedisOps;
import com.github.dingtalk.minapp.redis.RedisTemplateDtRedisOps;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
/**
 * 自动配置.
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
@AllArgsConstructor
@Configuration
@AutoConfigureAfter(RedisAutoConfiguration.class)
@ConditionalOnClass(DtAppService.class)
@EnableConfigurationProperties(DtAppProperties.class)
@ConditionalOnProperty(prefix = "dt.app", value = "enabled", matchIfMissing = true)
public class DtAppAutoConfiguration {

  private final DtAppProperties dtAppProperties;
  private final ApplicationContext applicationContext;


  @Bean
  @ConditionalOnMissingBean(DtAppService.class)
  public DtAppService dtAppService(DtAppConfig dtAppConfig) {
    DtAppService dtAppService = new DtAppServiceHttpClientImpl();
    dtAppService.setDtAppConfig(dtAppConfig);
    return dtAppService;
  }

  @Bean
  @ConditionalOnMissingBean(DtAppConfig.class)
  public DtAppConfig dtAppConfig() {
    DtAppDefaultConfigImpl config = DtAppRedisTemplateConfigStorage();
    config.setAppKey(StringUtils.trimToNull(this.dtAppProperties.getAppKey()));
    config.setAppSecret(StringUtils.trimToNull(this.dtAppProperties.getAppSecret()));
    return config;
  }

  private DtAppDefaultConfigImpl DtAppRedisTemplateConfigStorage() {
    StringRedisTemplate redisTemplate = applicationContext.getBean(StringRedisTemplate.class);
    DtRedisOps redisOps = new RedisTemplateDtRedisOps(redisTemplate);
    return new DtAppRedisBetterConfigImpl(redisOps);
  }
}
