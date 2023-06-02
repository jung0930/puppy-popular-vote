package com.deepdive.puppypopularvote.global.error.exception;

import com.deepdive.puppypopularvote.global.code.ErrorCode;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private ErrorCode errorCode;

    public BusinessException(final String message, final ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BusinessException(final ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

}
