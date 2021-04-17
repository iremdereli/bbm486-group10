package com.bbm486group10.exception;

import com.bbm486group10.util.constant.ApiMessages;

public class OpenedDoorCanNotBeUnlockedException extends RuntimeException {
    public OpenedDoorCanNotBeUnlockedException() {
        super(ApiMessages.OPENED_DOOR_CAN_NOT_BE_UNLOCKED);
    }
}
