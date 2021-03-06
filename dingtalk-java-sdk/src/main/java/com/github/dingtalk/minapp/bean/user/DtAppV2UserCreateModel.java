package com.github.dingtalk.minapp.bean.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/24 14:30
 **/
@Data
public class DtAppV2UserCreateModel implements Serializable {

    private static final long serialVersionUID = -1841698614917319763L;
    private String deptIdList;
    private String deptOrderList;
    private String deptTitleList;
    private String email;
    private Boolean exclusiveAccount;
    private String extension;
    private Boolean hideMobile;
    private Long hiredDate;
    private String jobNumber;
    private String loginEmail;
    private String mobile;
    private String name;
    private String orgEmail;
    private String remark;
    private Boolean seniorMode;
    private String telephone;
    private String title;
    private String userid;
    private String workPlace;
}
