package com.doorstate.exception;

import com.doorstate.util.constant.ApiMessages;

public class OpenedDoorCanNotBeUnlockedException extends RuntimeException {
    public OpenedDoorCanNotBeUnlockedException() {
        super(ApiMessages.OPENED_DOOR_CAN_NOT_BE_UNLOCKED);
    }
}
