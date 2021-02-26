package com.github.dingtalk.minapp.api;

import com.github.dingtalk.minapp.bean.user.*;

import java.util.List;

/**
 * 用户信息相关操作接口V2.
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
public interface DtAppV2UserService {

  /**
   * 根据日期查询企业下未活跃用户或活跃用户列表数据
   *
   * @param isActive : 是否是已激活钉钉：false：未激活 true：已激活
   * @param deptIds : 过滤部门ID列表，不传表示查询整个企业。
   * @param offset : 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量，偏移量从0开始。
   * @param size : 支持分页查询，与offset参数同时设置时才生效，此参数代表分页大小，最大100。
   * @param queryDate : 查询日期，日期格式为：yyyyMMdd。
   * @return : com.github.dingtalk.minapp.bean.InactiveV2User
   */
  DtAppV2PageInactiveUser getV2PageInactiveUser(Boolean isActive, String deptIds, Integer offset, Integer size, String queryDate);

  /**
   * 获取员工人数
   *
   * @param only_active : 是否包含未激活钉钉人数：false：包含未激活钉钉的人员数量 true：只包含激活钉钉的人员数量
   * @return : java.lang.Integer
   */
  Integer getV2UserCount(Boolean only_active);

  /**
   * 查询管理员列表
   *
   * @return : java.util.List<com.github.dingtalk.minapp.bean.DtAppV2AdminInfo>
   */
  List<DtAppV2AdminInfo> getV2LisAdminInfo();
  
  /**
   * 查询部门userid列表
   *
   * @param deptId : 部门ID，根部门ID为1。
   * @return : java.util.List<java.lang.String> userid
   */
  List<String> getV2DeptUseridList(Integer deptId);

  /**
   * 查询部门用户简易信息
   *
   * @param deptId : 部门ID，根部门ID为1。
   * @param cursor : 分页查询的游标，最开始传0，后续传返回参数中的next_cursor值。
   * @param size : 分页长度。
   * @param orderField : 部门成员的排序规则：entry_asc：代表按照进入部门的时间升序。entry_desc：代表按照进入部门的时间降序。modify_asc：代表按照部门信息修改时间升序。
   *                   modify_desc：代表按照部门信息修改时间降序。custom：代表用户定义(未定义时按照拼音)排序。默认值：custom。
   * @param containAccessLimit : 是否返回访问受限的员工。en_US：英文。
   * @param language : 通讯录语言，取值。zh_CN：中文（默认值）。
   * @return : com.github.dingtalk.minapp.bean.DtAppV2PageDeptUserSimple 用户简易信息
   */
  DtAppV2PageDeptUserSimple getV2PageDeptUserSimple(Integer deptId, Integer cursor, Integer size, String orderField, String containAccessLimit, String language);

  /**
   * 查询部门用户完整信息
   *
   * @param deptId : 部门ID，根部门ID为1。
   * @param cursor : 分页查询的游标，最开始传0，后续传返回参数中的next_cursor值。
   * @param size : 分页长度。
   * @param orderField : 部门成员的排序规则：entry_asc：代表按照进入部门的时间升序。entry_desc：代表按照进入部门的时间降序。modify_asc：代表按照部门信息修改时间升序。
   *                   modify_desc：代表按照部门信息修改时间降序。custom：代表用户定义(未定义时按照拼音)排序。默认值：custom。
   * @param containAccessLimit : 是否返回访问受限的员工。en_US：英文。
   * @param language : 通讯录语言，取值。zh_CN：中文（默认值）。
   * @return : com.github.dingtalk.minapp.bean.DtAppV2UserFullDetail 用户完整信息
   */
  DtAppV2UserFullDetail getV2PageDeptUserFullDetail(Integer deptId, Integer cursor, Integer size, String orderField, String containAccessLimit, String language);

  /**
   * 用户信息创建
   *
   * @param dtAppV2UserCreateModel : 用户创建实体类
   * @return : userid 用户id
   */
  String createUserV2(DtAppV2UserCreateModel dtAppV2UserCreateModel);

  /**
   *
   *
   * @param dtAppV2UserCreateModel : 用户更新实体类
   * @return : 更新标识 true:成功 fasle:失败
   */
  Boolean updateUserV2(DtAppV2UserUpdateModel dtAppV2UserUpdateModel);

  /**
   * 用户删除
   *
   * @param userid : 用户id
   * @return : 删除标识 true:成功 fasle:失败
   */
  Boolean UserDeleteV2(String userid);

  /**
   * 查询用户详情
   *
   * @param userid : 用户的userid。
   * @param language : 通讯录语言。zh_CN：中文（默认值）en_US：英文
   * @return : com.github.dingtalk.minapp.bean.user.DtAppV2UserDetail 用户详情
   */
  DtAppV2UserDetail getV2UserDetail(String userid,String language);

  /**
   * 根据手机号查询用户
   *
   * @param mobile : 手机号码
   * @return : userid: 用户id
   */
  String getUseridByMobile(String mobile);

  /**
   * 通过免登码获取用户userid(v2)
   *
   * @param requestAuthCode : 免登授权码
   * @return : com.github.dingtalk.minapp.bean.DtAppV2UserInfo 用户基本信息
   */
  DtAppV2UserInfo getV2UserInfo(String requestAuthCode);

}
