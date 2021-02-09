package com.github.dingtalk.minapp.exception;

/**
 * WxJava专用的runtime exception.
 *
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 * @date 2020-09-26
 */
public class DtRuntimeException extends RuntimeException {
  private static final long serialVersionUID = 4881698471192264412L;

  public DtRuntimeException(Throwable e) {
    super(e);
  }

  public DtRuntimeException(String msg) {
    super(msg);
  }

  public DtRuntimeException(String msg, Throwable e) {
    super(msg, e);
  }
}
