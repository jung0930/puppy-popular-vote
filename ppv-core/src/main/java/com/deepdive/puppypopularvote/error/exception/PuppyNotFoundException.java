package com.deepdive.puppypopularvote.error.exception;

import com.deepdive.puppypopularvote.error.ErrorCode;

public class PuppyNotFoundException extends BusinessException {

    public PuppyNotFoundException() {
        super(ErrorCode.PUPPY_NOT_FOUND);
    }

}
