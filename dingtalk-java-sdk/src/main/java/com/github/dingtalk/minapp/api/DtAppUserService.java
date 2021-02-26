package com.github.dingtalk.minapp.api;

import com.github.dingtalk.minapp.bean.user.DtAppUserInfo;

/**
  * 用户信息相关操作接口.
  *
 * @Author young
 * @Date 2021/2/19 14:43
 **/
public interface DtAppUserService {

    /**
     * 通过免登码获取用户userid(v2)
     *
     * @param requestAuthCode
     * @return DtAppV2UserInfo
     */
    DtAppUserInfo getUserInfo(String requestAuthCode);
}
