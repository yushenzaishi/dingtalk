package com.github.dingtalk.minapp.bean.dept;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/25 16:01
 **/
@Data
public class DtAppDepartmentCreateModel implements Serializable {

    private static final long serialVersionUID = 5721939576684980723L;
    private Boolean createDeptGroup;
    private String deptPermits;
    private String extension;
    private Boolean hideDept;
    private String name;
    private Long order;
    private Boolean outerDept;
    private Boolean outerDeptOnlySelf;
    private String outerPermitDepts;
    private String outerPermitUsers;
    private Long parentId;
    private String sourceIdentifier;
    private String userPermits;
}
