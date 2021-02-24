package com.github.dingtalk.minapp.bean.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/7 15:11
 **/
@Data
public class DtAppV2UserInfo implements Serializable {

    private static final long serialVersionUID = -2135540765025139855L;

    private String associatedUnionid;
    private String deviceId;
    private String name;
    private Boolean sys;
    private Long sysLevel;
    private String unionid;
    private String userid;
}
