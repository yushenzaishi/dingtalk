package com.github.dingtalk.minapp.bean.user;

import com.taobao.api.internal.mapping.ApiField;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author young
 * @Date 2021/2/24 14:43
 **/
@Data
public class DeptTitle implements Serializable {

    private static final long serialVersionUID = -4453563728996866997L;

    private Long deptId;
    private String title;
}
