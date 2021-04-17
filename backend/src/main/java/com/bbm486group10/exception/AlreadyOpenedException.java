package com.bbm486group10.exception;

import com.bbm486group10.util.constant.ApiMessages;

public class AlreadyOpenedException extends RuntimeException {
    public AlreadyOpenedException() {
        super(ApiMessages.ALREADY_OPEN_EXCEPTION);
    }
}
