package com.doorstate.exception;

import com.doorstate.util.constant.ApiMessages;

public class AlreadyOpenedException extends RuntimeException {
    public AlreadyOpenedException() {
        super(ApiMessages.ALREADY_OPEN_EXCEPTION);
    }
}
