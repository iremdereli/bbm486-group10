package com.doorstate.exception;

import com.doorstate.util.constant.ApiMessages;

public class ClosedDoorCanNotBeUnlockedException extends RuntimeException {
    public ClosedDoorCanNotBeUnlockedException() {
        super(ApiMessages.CLOSED_DOOR_CAN_NOT_BE_UNLOCKED);
    }
}
