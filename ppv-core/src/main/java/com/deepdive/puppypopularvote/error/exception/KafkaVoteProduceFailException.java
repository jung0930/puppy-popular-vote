package com.deepdive.puppypopularvote.error.exception;

import com.deepdive.puppypopularvote.error.ErrorCode;

public class KafkaVoteProduceFailException extends BusinessException {

    public KafkaVoteProduceFailException() {
        super(ErrorCode.KAFKA_VOTE_PRODUCE_FAIL);
    }

}
