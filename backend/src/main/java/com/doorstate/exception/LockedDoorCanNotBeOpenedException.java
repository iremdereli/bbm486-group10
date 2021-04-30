package com.doorstate.exception;

import com.doorstate.util.constant.ApiMessages;

public class LockedDoorCanNotBeOpenedException extends RuntimeException {
  public LockedDoorCanNotBeOpenedException() {
    super(ApiMessages.LOCKED_DOOR_CAN_NOT_BE_OPENED);
  }
}
