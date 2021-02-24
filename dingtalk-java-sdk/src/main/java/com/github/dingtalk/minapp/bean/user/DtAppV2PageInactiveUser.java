package com.github.dingtalk.minapp.bean.user;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author young
 * @Date 2021/2/24 9:22
 **/
@Data
public class DtAppV2PageInactiveUser implements Serializable {

    private static final long serialVersionUID = 3854645688293280556L;

    private Boolean hasMore;
    private List<String> list;
    private Long nextCursor;
}
