package com.github.dingtalk.minapp.api.impl;

import com.github.dingtalk.minapp.api.DtAppService;
import com.github.dingtalk.minapp.api.DtAppV2DeptService;
import com.github.dingtalk.minapp.bean.dept.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/25 10:21
 **/
@Slf4j
@RequiredArgsConstructor
public class DtAppV2DeptServiceImpl implements DtAppV2DeptService {

    private final DtAppService dtAppService;

    @Override
    public String getV2ParentDepts(String userid) {
        return null;
    }

    @Override
    public DtAppV2DeptParentByUser getV2ListParentDeptByUser(String userid) {
        return null;
    }

    @Override
    public DtAppV2DeptParentByDept getV2ListParentDeptByDept(Integer deptId) {
        return null;
    }

    @Override
    public Long departmentCreateV2(DtAppDepartmentCreateModel dtAppDepartmentCreateModel) {
        return null;
    }

    @Override
    public Boolean departmentUpdateV2(DtAppDepartmentUpdateModel dtAppDepartmentUpdateModel) {
        return null;
    }

    @Override
    public Boolean departmentDeleteV2(Integer deptId) {
        return null;
    }

    @Override
    public DtAppV2DeptDetail getV2DepartmentDetail(Integer deptId, String language) {
        return null;
    }

    @Override
    public DtAppV2DeparmentBase getV2DepartmentListSub(Integer deptId, String language) {
        return null;
    }

    @Override
    public List<Long> getV2DepartmentListSubId(Integer deptId) {
        return null;
    }
}
