package com.doorstate.exception;

import com.doorstate.util.constant.ApiMessages;

public class AlreadyLockedException extends RuntimeException {
  public AlreadyLockedException() {
    super(ApiMessages.ALREADY_LOCKED_EXCEPTION);
  }
}
