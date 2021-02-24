package com.github.dingtalk.minapp.bean.user;

import com.taobao.api.internal.mapping.ApiField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/24 14:45
 **/
@Data
public class DeptOrder implements Serializable {

    private static final long serialVersionUID = -8905526853926591232L;

    private Long deptId;
    private Long order;
}
