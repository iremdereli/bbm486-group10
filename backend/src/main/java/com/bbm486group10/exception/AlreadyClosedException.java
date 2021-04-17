package com.bbm486group10.exception;

import com.bbm486group10.util.constant.ApiMessages;

public class AlreadyClosedException extends RuntimeException {
    public AlreadyClosedException() {
        super(ApiMessages.ALREADY_CLOSED_EXCEPTION);
    }
}
