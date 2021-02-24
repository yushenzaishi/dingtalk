package com.github.dingtalk.minapp.bean.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/24 10:08
 **/
@Data
public class DtAppV2AdminInfo implements Serializable {

    private static final long serialVersionUID = -6793240835982561070L;

    private Long sysLevel;
    private String userid;
}
