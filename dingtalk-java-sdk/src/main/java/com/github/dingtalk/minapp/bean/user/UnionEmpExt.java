package com.github.dingtalk.minapp.bean.user;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/24 15:17
 **/
@Data
public class UnionEmpExt implements Serializable {

    private static final long serialVersionUID = 1869824253672267340L;

    private String corpId;
    private List<UnionEmpMapVo> unionEmpMapList;
    private String userid;
}
