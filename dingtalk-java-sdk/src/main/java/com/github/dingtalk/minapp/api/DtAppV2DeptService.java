package com.github.dingtalk.minapp.api;

import com.github.dingtalk.minapp.bean.dept.*;

import java.util.List;

/**
 * 部门管理相关接口V2.
 *
 * @Author young
 * @Date 2021/2/25 10:19
 **/
public interface DtAppV2DeptService {

    /**
     * 查询指定用户的所有上级父部门路径
     *
     * @param userid : 用户id
     * @return : java.lang.String deparment : 部门路径集合
     */
    String getV2ParentDepts(String userid);

    /**
     * 查询用户所有父部门列表
     *
     * @param userid : 用户id
     * @return : com.github.dingtalk.minapp.bean.dept.DtAppV2DeptParentByUser 父部门列表
     */
    DtAppV2DeptParentByUser getV2ListParentDeptByUser(String userid);


    /**
     * 查询部门所有父部门列表
     *
     * @param deptId : 要查询的部门的ID
     * @return : com.github.dingtalk.minapp.bean.dept.DtAppV2DeptParentByDept 父部门列表
     */
    DtAppV2DeptParentByDept getV2ListParentDeptByDept(Integer deptId);

    /**
     * 创建部门
     *
     * @param dtAppDepartmentCreateModel :
     * @return : java.lang.Integer dept_id:部门id
     */
    Long departmentCreateV2(DtAppDepartmentCreateModel dtAppDepartmentCreateModel);
    
    /**
     * 更新部门
     *
     * @param dtAppDepartmentUpdateModel : 
     * @return : java.lang.Boolean 更新标识 true:成功 fasle:失败
     */
    Boolean departmentUpdateV2(DtAppDepartmentUpdateModel dtAppDepartmentUpdateModel);
    
    /**
     * 删除部门
     *
     * @param deptId : 要删除的部门ID。
     * @return : java.lang.Boolean 删除标识 true:成功 fasle:失败
     */
    Boolean departmentDeleteV2(Integer deptId);

    /**
     * 获取部门详情
     *
     * @param deptId : 部门ID，根部门ID为1
     * @param language : 通讯录语言：zh_CN（默认）：中文 en_US：英文
     * @return : com.github.dingtalk.minapp.bean.dept.DtAppV2DeptDetail
     */
    DtAppV2DeptDetail getV2DepartmentDetail(Integer deptId,String language);


    /**
     * 获取子部门列表
     *
     * @param deptId : 部门ID，根部门ID为1
     * @param language : 通讯录语言：zh_CN（默认）：中文 en_US：英文
     * @return : com.github.dingtalk.minapp.bean.dept.DtAppV2DeparmentBase
     */
    DtAppV2DeparmentBase getV2DepartmentListSub(Integer deptId,String language);

    /**
     * 获取子部门ID列表
     *
     * @param deptId : 部门ID，根部门ID为1
     * @return : java.util.List<java.lang.Long> 子部门id列表
     */
    List<Long> getV2DepartmentListSubId(Integer deptId);
}
