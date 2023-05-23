package com.deepdive.puppypopularvote.global.error.exception;

import com.deepdive.puppypopularvote.global.code.ErrorCode;

public class PuppyNotFoundException extends BusinessException {

    public PuppyNotFoundException() {
        super(ErrorCode.PUPPY_NOT_FOUND);
    }

}
