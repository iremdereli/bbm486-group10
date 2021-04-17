package com.doorstate.exception;

import com.doorstate.util.constant.ApiMessages;

public class OpenedDoorCanNotBeLockedException extends RuntimeException {
    public OpenedDoorCanNotBeLockedException() {
        super(ApiMessages.OPENED_DOOR_CAN_NOT_BE_LOCKED);
    }
}
