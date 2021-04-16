package com.bbm486group10.exception;

import com.bbm486group10.util.constant.ApiMessages;

public class ClosedDoorCanNotBeUnlockedException extends RuntimeException {
    public ClosedDoorCanNotBeUnlockedException() {
        super(ApiMessages.CLOSED_DOOR_CAN_NOT_BE_UNLOCKED);
    }
}
