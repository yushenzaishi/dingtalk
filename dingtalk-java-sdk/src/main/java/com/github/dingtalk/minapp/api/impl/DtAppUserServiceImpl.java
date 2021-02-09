package com.github.dingtalk.minapp.api.impl;

import com.github.dingtalk.minapp.api.DtAppService;
import com.github.dingtalk.minapp.api.DtAppUserService;
import com.github.dingtalk.minapp.bean.DtAppUserInfo;
import lombok.RequiredArgsConstructor;

/**
 * @Author young
 * @Date 2021/2/7 15:17
 **/
@RequiredArgsConstructor
public class DtAppUserServiceImpl implements DtAppUserService {

    private final DtAppService dtAppService;

    @Override
    public DtAppUserInfo getUserInfo(String requestAuthCode) {
        return new DtAppUserInfo();
    }
}
