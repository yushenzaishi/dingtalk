package com.github.dingtalk.minapp.bean;

import com.taobao.api.internal.mapping.ApiField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/7 15:11
 **/
@Data
public class DtAppUserInfo implements Serializable {

    private static final long serialVersionUID = -2628464615260234182L;

    private String associatedUnionid;
    private String deviceId;
    private String name;
    private Boolean sys;
    private Long sysLevel;
    private String unionid;
    private String userid;
}
