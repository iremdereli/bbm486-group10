package com.bbm486group10.exception;

import com.bbm486group10.util.constant.ApiMessages;

public class AlreadyLockedException extends RuntimeException {
    public AlreadyLockedException() {
        super(ApiMessages.ALREADY_LOCKED_EXCEPTION);
    }
}
