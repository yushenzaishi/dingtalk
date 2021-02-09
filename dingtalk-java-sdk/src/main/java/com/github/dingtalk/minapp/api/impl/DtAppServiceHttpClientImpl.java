package com.github.dingtalk.minapp.api.impl;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.github.dingtalk.minapp.exception.DtRuntimeException;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;

/**
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Slf4j
public class DtAppServiceHttpClientImpl extends BaseDtAppServiceImpl {

  @Override
  protected OapiGettokenResponse doGetAccessTokenRequest() throws ApiException {
      DefaultDingTalkClient client = new DefaultDingTalkClient(URL_GET_TOKKEN);
      OapiGettokenRequest request = new OapiGettokenRequest();

      request.setAppkey(this.getDtAppConfig().getAppKey());
      request.setAppsecret(this.getDtAppConfig().getAppSecret());
      request.setHttpMethod("GET");
      OapiGettokenResponse response = client.execute(request);
      return response;
  }

}
