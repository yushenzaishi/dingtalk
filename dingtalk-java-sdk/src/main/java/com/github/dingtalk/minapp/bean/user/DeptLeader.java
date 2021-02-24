package com.github.dingtalk.minapp.bean.user;

import com.taobao.api.internal.mapping.ApiField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/24 15:15
 **/
@Data
public class DeptLeader implements Serializable {

    private static final long serialVersionUID = -4759367877723941161L;

    private Long deptId;
    private Boolean leader;
}
