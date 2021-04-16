package com.bbm486group10.exception;

import com.bbm486group10.util.constant.ApiMessages;

public class LockedDoorCanNotBeOpenedException extends RuntimeException {
    public LockedDoorCanNotBeOpenedException() {
        super(ApiMessages.LOCKED_DOOR_CAN_NOT_BE_OPENED);
    }
}
