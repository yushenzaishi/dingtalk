package com.github.dingtalk.minapp.api.impl;

import com.github.dingtalk.minapp.api.DtAppService;
import com.github.dingtalk.minapp.api.DtAppV2UserService;
import com.github.dingtalk.minapp.bean.user.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author young
 * @Date 2021/2/7 15:17
 **/
@Slf4j
@RequiredArgsConstructor
public class DtAppV2UserServiceImpl implements DtAppV2UserService {

    private final DtAppService dtAppService;

    @Override
    public DtAppV2PageInactiveUser getV2PageInactiveUser(Boolean isActive, String deptIds, Integer offset, Integer size, String queryDate) {
        return null;
    }

    @Override
    public Integer getV2UserCount(Boolean only_active) {
        return null;
    }

    @Override
    public List<DtAppV2AdminInfo> getV2LisAdminInfo() {
        return null;
    }

    @Override
    public List<String> getV2DeptUseridList(Integer deptId) {
        return null;
    }

    @Override
    public DtAppV2PageDeptUserSimple getV2PageDeptUserSimple(Integer deptId, Integer cursor, Integer size, String orderField, String containAccessLimit, String language) {
        return null;
    }

    @Override
    public DtAppV2UserFullDetail getV2PageDeptUserFullDetail(Integer deptId, Integer cursor, Integer size, String orderField, String containAccessLimit, String language) {
        return null;
    }

    @Override
    public String createUserV2(DtAppV2UserCreateModel dtAppV2UserCreateModel) {
        return null;
    }

    @Override
    public Boolean updateUserV2(DtAppV2UserUpdateModel dtAppV2UserUpdateModel) {
        return null;
    }

    @Override
    public Boolean UserDeleteV2(String userid) {
        return null;
    }

    @Override
    public DtAppV2UserDetail getV2UserDetail(String userid, String language) {
        return null;
    }

    @Override
    public String getUseridByMobile(String mobile) {
        return null;
    }

    @Override
    public DtAppV2UserInfo getV2UserInfo(String requestAuthCode) {
        return null;
    }
}
