package com.shoppingmall.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class NotExistReviewException extends RuntimeException {
    public NotExistReviewException(String message) {
        super(message);
    }
}
