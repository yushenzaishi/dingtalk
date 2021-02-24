package com.github.dingtalk.minapp.bean.user;

import com.taobao.api.internal.mapping.ApiField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/24 15:16
 **/
@Data
public class UserRole implements Serializable {

    private static final long serialVersionUID = 4653888864829994305L;

    private String groupName;
    private Long id;
    private String name;
}
