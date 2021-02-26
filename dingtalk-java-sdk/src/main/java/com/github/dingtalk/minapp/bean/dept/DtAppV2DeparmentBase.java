package com.github.dingtalk.minapp.bean.dept;

import com.taobao.api.internal.mapping.ApiField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/25 16:22
 **/
@Data
public class DtAppV2DeparmentBase implements Serializable {

    private static final long serialVersionUID = -2343684585069409489L;
    private Boolean autoAddUser;
    private Boolean createDeptGroup;
    private Long deptId;
    private String ext;
    private Boolean fromUnionOrg;
    private String name;
    private Long parentId;
    private String sourceIdentifier;
    private String tags;
}
