package com.github.dingtalk.minapp.bean.dept;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/25 11:02
 **/
@Data
public class DtAppV2DeptParentByDept implements Serializable {

    private static final long serialVersionUID = -4708395531452595560L;
    private List<Long> parentDeptIdList;
}
