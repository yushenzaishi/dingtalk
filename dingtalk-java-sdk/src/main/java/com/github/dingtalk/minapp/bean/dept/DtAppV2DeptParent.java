package com.github.dingtalk.minapp.bean.dept;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/25 11:03
 **/
@Data
public class DtAppV2DeptParent implements Serializable {

    private static final long serialVersionUID = 579594667671364064L;
    private List<Long> parentDeptIdList;

}
