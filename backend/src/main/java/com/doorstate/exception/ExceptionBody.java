package com.doorstate.exception;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class ExceptionBody {
    public final String message;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private final LocalDateTime createdAt;

    public ExceptionBody(String message, LocalDateTime createdAt) {
        this.message = message;
        this.createdAt = createdAt;
    }
}
