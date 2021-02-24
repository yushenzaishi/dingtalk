package com.github.dingtalk.minapp.bean.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/19 14:08
 **/
@Data
public class DtAppUserInfo implements Serializable {

    private static final long serialVersionUID = -6123146014862538272L;

    private String deviceId;
    private Boolean isSys;
    private Long sysLevel;
    private String userid;
}
