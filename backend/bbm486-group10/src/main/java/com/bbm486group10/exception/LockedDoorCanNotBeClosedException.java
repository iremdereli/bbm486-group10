package com.bbm486group10.exception;

import com.bbm486group10.util.constant.ApiMessages;

public class LockedDoorCanNotBeClosedException extends RuntimeException {
    public LockedDoorCanNotBeClosedException() {
        super(ApiMessages.LOCKED_DOOR_CAN_NOT_BE_CLOSED);
    }
}
