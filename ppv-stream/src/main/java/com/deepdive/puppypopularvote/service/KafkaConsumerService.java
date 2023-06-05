package com.deepdive.puppypopularvote.service;

import com.deepdive.puppypopularvote.domain.db.Puppy;
import com.deepdive.puppypopularvote.domain.kafka.VoteTopic;
import com.deepdive.puppypopularvote.error.exception.PuppyNotFoundException;
import com.deepdive.puppypopularvote.repository.db.PuppyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class KafkaConsumerService {

    private final PuppyRepository puppyRepository;

    @KafkaListener(topics = {"vote"}, groupId = "vote")
    public void consumerPuppyVoteMessage(VoteTopic voteTopic) {
        System.out.println("######################");
        System.out.println("getId : " + voteTopic.getId());
        System.out.println("getVoteStatus : " + voteTopic.getVoteStatus());

        // Database에 투표 정보 Update
        Puppy puppy = puppyRepository.findById(voteTopic.getId())
                .orElseThrow(() -> new PuppyNotFoundException());

        System.out.println("## puppy : " + puppy);

//
//        puppy.vote(voteTopic.getVoteStatus());
//
//        puppyRepository.save(puppy);
        // Redis에 투표 정보 Update

    }

}
