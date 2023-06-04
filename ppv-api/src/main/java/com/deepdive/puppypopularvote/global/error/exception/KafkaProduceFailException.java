package com.deepdive.puppypopularvote.global.error.exception;

import com.deepdive.puppypopularvote.global.code.ErrorCode;

public class KafkaProduceFailException extends BusinessException{

    public KafkaProduceFailException() {
        super(ErrorCode.KAFKA_VOTE_PRODUCE_FAIL);
    }

}
