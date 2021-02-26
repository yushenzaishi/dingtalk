package com.github.dingtalk.minapp.bean.dept;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/25 16:14
 **/
@Data
public class DtAppV2DeptDetail implements Serializable {

    private static final long serialVersionUID = 2277122074532224004L;
    private Boolean autoAddUser;
    private Boolean createDeptGroup;
    private String deptGroupChatId;
    private Long deptId;
    private List<String> deptManagerUseridList;
    private List<Long> deptPermits;
    private String extention;
    private Boolean fromUnionOrg;
    private Boolean groupContainSubDept;
    private Boolean hideDept;
    private String name;
    private Long order;
    private String orgDeptOwner;
    private Boolean outerDept;
    private List<Long> outerPermitDepts;
    private List<String> outerPermitUsers;
    private Long parentId;
    private String sourceIdentifier;
    private String tags;
    private List<String> userPermits;
}
