package com.github.dingtalk.minapp.bean.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/24 9:59
 **/
@Data
public class DtAppV2UserByUnionIdInfo implements Serializable {

    private static final long serialVersionUID = -4378384825493505159L;

    private Long contactType;
    private String userid;
}
