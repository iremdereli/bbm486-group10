package com.doorstate.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionBody> handleUnsupportedCurrencyCreation(RuntimeException e) {
        return ResponseEntity.badRequest()
                .body(new ExceptionBody(e.getMessage(), LocalDateTime.now()));
    }
}
