package com.doorstate.exception;

import com.doorstate.util.constant.ApiMessages;

public class AlreadyClosedException extends RuntimeException {
    public AlreadyClosedException() {
        super(ApiMessages.ALREADY_CLOSED_EXCEPTION);
    }
}
