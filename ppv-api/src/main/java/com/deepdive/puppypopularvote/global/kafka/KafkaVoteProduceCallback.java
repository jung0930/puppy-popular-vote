package com.deepdive.puppypopularvote.global.kafka;

import com.deepdive.puppypopularvote.domain.kafka.VoteTopic;
import com.deepdive.puppypopularvote.global.error.exception.KafkaProduceFailException;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFutureCallback;

public class KafkaVoteProduceCallback implements ListenableFutureCallback<SendResult> {

    @Override
    public void onSuccess(SendResult result) {
        // LOGGER.info("Sent message=[" + message + "] with offset=[" + result.getRecordMetadata().offset() + "]");
    }

    @Override
    public void onFailure(Throwable ex) {
        // LOGGER.info("Unable to send message=[" + message + "] due to : " + ex.getMessage());
        new KafkaProduceFailException();
    }


}
