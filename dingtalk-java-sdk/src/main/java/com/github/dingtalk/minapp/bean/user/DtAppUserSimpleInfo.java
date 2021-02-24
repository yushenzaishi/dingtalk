package com.github.dingtalk.minapp.bean.user;

import com.taobao.api.internal.mapping.ApiField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/24 11:26
 **/
@Data
public class DtAppUserSimpleInfo implements Serializable {

    private static final long serialVersionUID = 2607865836542320113L;

    private String name;
    private String userid;

}
