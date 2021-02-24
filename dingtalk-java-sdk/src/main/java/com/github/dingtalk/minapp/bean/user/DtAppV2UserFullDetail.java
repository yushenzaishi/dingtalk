package com.github.dingtalk.minapp.bean.user;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/24 16:31
 **/
@Data
public class DtAppV2UserFullDetail implements Serializable {

    private static final long serialVersionUID = -6098132364563421994L;

    private Boolean active;
    private Boolean admin;
    private String avatar;
    private Boolean boss;
    private List<Long> deptIdList;
    private Long deptOrder;
    private String email;
    private Boolean exclusiveAccount;
    private String extension;
    private Boolean hideMobile;
    private Long hiredDate;
    private String jobNumber;
    private Boolean leader;
    private String mobile;
    private String name;
    private String orgEmail;
    private String remark;
    private String stateCode;
    private String telephone;
    private String title;
    private String unionid;
    private String userid;
    private String workPlace;
}
