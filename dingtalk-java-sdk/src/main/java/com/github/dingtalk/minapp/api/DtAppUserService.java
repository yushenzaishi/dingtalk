package com.github.dingtalk.minapp.api;


import com.github.dingtalk.minapp.bean.DtAppUserInfo;

import java.util.Map;

/**
 * 用户信息相关操作接口.
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
public interface DtAppUserService {

  /**
   *
   * @param requestAuthCode
   */
  DtAppUserInfo getUserInfo(String requestAuthCode);

}
