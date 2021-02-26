package com.github.dingtalk.minapp.bean.dept;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/25 16:01
 **/
@Data
public class DtAppDepartmentUpdateModel implements Serializable {

    private static final long serialVersionUID = 6975527522436064556L;
    private Boolean autoAddUser;
    private Boolean createDeptGroup;
    private Long deptId;
    private String deptManagerUseridList;
    private String deptPermits;
    private String extension;
    private Boolean groupContainHiddenDept;
    private Boolean groupContainOuterDept;
    private Boolean groupContainSubDept;
    private Boolean hideDept;
    private String language;
    private String name;
    private Long order;
    private String orgDeptOwner;
    private Boolean outerDept;
    private Boolean outerDeptOnlySelf;
    private String outerPermitDepts;
    private String outerPermitUsers;
    private Long parentId;
    private String sourceIdentifier;
    private String userPermits;
}
