package com.github.dingtalk.minapp.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * access token.
 *
 * @author yuhaoda
 * @date 2021-02-04
 */
@Data
public class DtAccessToken implements Serializable {
  private static final long serialVersionUID = 8709719312922168909L;

  private String accessToken;

  private int expiresIn = -1;


}
