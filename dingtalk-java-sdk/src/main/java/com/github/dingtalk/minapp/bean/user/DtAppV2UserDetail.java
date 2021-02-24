package com.github.dingtalk.minapp.bean.user;

import com.dingtalk.api.response.OapiV2UserGetResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/24 15:11
 **/
@Data
public class DtAppV2UserDetail implements Serializable {

    private static final long serialVersionUID = -5842490527456376879L;

    private Boolean active;
    private Boolean admin;
    private String avatar;
    private Boolean boss;
    private List<Long> deptIdList;
    private List<DeptOrder> deptOrderList;
    private String email;
    private Boolean exclusiveAccount;
    private String extension;
    private Boolean hideMobile;
    private Long hiredDate;
    private String jobNumber;
    private List<DeptLeader> leaderInDept;
    private String mobile;
    private String name;
    private String orgEmail;
    private Boolean realAuthed;
    private String remark;
    private List<UserRole> roleList;
    private Boolean senior;
    private String stateCode;
    private String telephone;
    private String title;
    private UnionEmpExt unionEmpExt;
    private String unionid;
    private String userid;
    private String workPlace;
}
