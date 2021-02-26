package com.github.dingtalk.minapp.config.constant;

import lombok.experimental.UtilityClass;

/**
 * 接口地址常量.
 *
 * @Author young
 * @Date 2021/2/25 10:19
 */
@UtilityClass
public class DtAppApiUrlConstants {
  public interface userV2{

  }

  public interface dept {
    String GET_LIST_PARENT_DEPTS_URL = "https://oapi.dingtalk.com/department/list_parent_depts";
    String POST_LIST_PARENT_BY_USER_URL = "https://oapi.dingtalk.com/topapi/v2/department/listparentbyuser";
    String POST_LIST_PARENT_BY_DEPT_URL = "https://oapi.dingtalk.com/topapi/v2/department/listparentbydept";
    String POST_DEPARTMENT_CREATE_URL = "https://oapi.dingtalk.com/topapi/v2/department/create";
    String POST_DEPARTMENT_UPDATE_URL = "https://oapi.dingtalk.com/topapi/v2/department/update";
    String POST_DEPARTMENT_DELETE_URL = "https://oapi.dingtalk.com/topapi/v2/department/delete";
    String POST_DEPARTMENT_detail_URL = "https://oapi.dingtalk.com/topapi/v2/department/get";
    String POST_DEPARTMENT_LISTSUB_URL = "https://oapi.dingtalk.com/topapi/v2/department/listsub";
    String POST_DEPARTMENT_LISTSUBID_URL = "https://oapi.dingtalk.com/topapi/v2/department/listsubid";
  }
}
