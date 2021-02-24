package com.github.dingtalk.minapp.bean.user;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/24 11:17
 **/
@Data
public class DtAppV2PageDeptUserSimple implements Serializable {

    private static final long serialVersionUID = -1912622468239951915L;

    private Boolean hasMore;
    private List<DtAppUserSimpleInfo> list;
    private Long nextCursor;
}
