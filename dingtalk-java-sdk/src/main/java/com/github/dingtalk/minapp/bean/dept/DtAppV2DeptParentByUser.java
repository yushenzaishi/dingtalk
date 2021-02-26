package com.github.dingtalk.minapp.bean.dept;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/25 11:02
 **/
@Data
public class DtAppV2DeptParentByUser implements Serializable {

    private static final long serialVersionUID = 6488082383841048506L;
    private List<DtAppV2DeptParent> parentList;
}
