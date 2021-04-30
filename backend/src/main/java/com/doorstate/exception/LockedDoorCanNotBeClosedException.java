package com.doorstate.exception;

import com.doorstate.util.constant.ApiMessages;

public class LockedDoorCanNotBeClosedException extends RuntimeException {
  public LockedDoorCanNotBeClosedException() {
    super(ApiMessages.LOCKED_DOOR_CAN_NOT_BE_CLOSED);
  }
}
