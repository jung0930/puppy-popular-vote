package com.deepdive.puppypopularvote.puppy.service.impl;

import com.deepdive.puppypopularvote.code.Sex;
import com.deepdive.puppypopularvote.code.VoteStatus;
import com.deepdive.puppypopularvote.domain.db.Puppy;
import com.deepdive.puppypopularvote.domain.kafka.VoteTopic;
import com.deepdive.puppypopularvote.domain.redis.RedisPuppyDetail;
import com.deepdive.puppypopularvote.global.error.exception.PuppyNotFoundException;
import com.deepdive.puppypopularvote.global.kafka.KafkaVoteProduceCallback;
import com.deepdive.puppypopularvote.puppy.dto.PuppyDto;
import com.deepdive.puppypopularvote.puppy.repository.db.PuppyRepository;
import com.deepdive.puppypopularvote.puppy.repository.redis.RedisPuppyDetailRepository;
import com.deepdive.puppypopularvote.puppy.service.PuppyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.concurrent.ListenableFuture;

@RequiredArgsConstructor
@Service
public class PuppyServiceImpl implements PuppyService {

    private final static String KAFKA_TOPIC_VOTE = "vote";

    private final PuppyRepository puppyRepository;
    private final RedisPuppyDetailRepository redisPuppyDetailRepository;
    private final ModelMapper modelMapper;
    private final KafkaTemplate<String, VoteTopic> kafkaTemplate;

    @Override
    @Transactional(readOnly = true)
    public PuppyDto.ListResponse findPuppies(final Pageable pageable) {
        Page<Puppy> puppies = puppyRepository.findAll(pageable);

        Page<PuppyDto.Detail> puppyDtos = puppies.map(puppy -> modelMapper.map(puppy, PuppyDto.Detail.class));

        return PuppyDto.ListResponse.of(puppyDtos);
    }

    @Override
    @Transactional
    public PuppyDto.DetailResponse findPuppyById(final Long id) {
        if (hasPuppyInRedisCache(id)) {
            return modelMapper.map(redisPuppyDetailRepository.findById(id), PuppyDto.DetailResponse.class);
        }

        Puppy puppy = puppyRepository.findById(id)
                .orElseThrow(() -> new PuppyNotFoundException());

        savePuppyToRedisCache(puppy);

        return modelMapper.map(puppy, PuppyDto.DetailResponse.class);
    }

    @Override
    @Async
    public void vote(Long id, VoteStatus voteStatus) {
        ListenableFuture<SendResult<String, VoteTopic>> future = kafkaTemplate.send(KAFKA_TOPIC_VOTE, VoteTopic.of(id, voteStatus));
        future.addCallback(new KafkaVoteProduceCallback());
    }

    private boolean hasPuppyInRedisCache(final Long id) {
        return redisPuppyDetailRepository.findById(id).isPresent();
    }

    private void savePuppyToRedisCache(final Puppy puppy) {
        RedisPuppyDetail redisPuppyDetail = RedisPuppyDetail.builder()
                .id(puppy.getId())
                .name(puppy.getName())
                .photoFileName(puppy.getPhotoFileName())
                .summaryDescription(puppy.getSummaryDescription())
                .detailDescription(puppy.getDetailDescription())
                .sex(puppy.getSex())
                .voteCount(puppy.getVoteCount())
                .build();

        redisPuppyDetailRepository.save(redisPuppyDetail);
    }


    @Override
    public void createPuppys() {
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지1")
                        .sex(Sex.MALE)
                        .detailDescription("강아지1 자세한 소개글")
                        .summaryDescription("강아지1 간단한 소개글")
                        .photoFileName("강아지1.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지2")
                        .sex(Sex.FEMALE)
                        .detailDescription("강아지2 자세한 소개글")
                        .summaryDescription("강아지2 간단한 소개글")
                        .photoFileName("강아지2.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지3")
                        .sex(Sex.FEMALE)
                        .detailDescription("강아지3 자세한 소개글")
                        .summaryDescription("강아지3 간단한 소개글")
                        .photoFileName("강아지3.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지4")
                        .sex(Sex.MALE)
                        .detailDescription("강아지4 자세한 소개글")
                        .summaryDescription("강아지4 간단한 소개글")
                        .photoFileName("강아지4.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지5")
                        .sex(Sex.FEMALE)
                        .detailDescription("강아지5 자세한 소개글")
                        .summaryDescription("강아지5 간단한 소개글")
                        .photoFileName("강아지5.jpg")
                        .voteCount(0)
                        .build());


        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지6")
                        .sex(Sex.MALE)
                        .detailDescription("강아지6 자세한 소개글")
                        .summaryDescription("강아지6 간단한 소개글")
                        .photoFileName("강아지6.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지7")
                        .sex(Sex.FEMALE)
                        .detailDescription("강아지7 자세한 소개글")
                        .summaryDescription("강아지7 간단한 소개글")
                        .photoFileName("강아지7.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지8")
                        .sex(Sex.FEMALE)
                        .detailDescription("강아지8 자세한 소개글")
                        .summaryDescription("강아지8 간단한 소개글")
                        .photoFileName("강아지8.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지9")
                        .sex(Sex.MALE)
                        .detailDescription("강아지9 자세한 소개글")
                        .summaryDescription("강아지9 간단한 소개글")
                        .photoFileName("강아지9.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지10")
                        .sex(Sex.MALE)
                        .detailDescription("강아지10 자세한 소개글")
                        .summaryDescription("강아지10 간단한 소개글")
                        .photoFileName("강아지10.jpg")
                        .voteCount(0)
                        .build());


        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지11")
                        .sex(Sex.MALE)
                        .detailDescription("강아지11 자세한 소개글")
                        .summaryDescription("강아지11 간단한 소개글")
                        .photoFileName("강아지11.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지12")
                        .sex(Sex.FEMALE)
                        .detailDescription("강아지12 자세한 소개글")
                        .summaryDescription("강아지12 간단한 소개글")
                        .photoFileName("강아지12.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지13")
                        .sex(Sex.FEMALE)
                        .detailDescription("강아지13 자세한 소개글")
                        .summaryDescription("강아지13 간단한 소개글")
                        .photoFileName("강아지13.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지14")
                        .sex(Sex.MALE)
                        .detailDescription("강아지14 자세한 소개글")
                        .summaryDescription("강아지14 간단한 소개글")
                        .photoFileName("강아지14.jpg")
                        .voteCount(0)
                        .build());
        puppyRepository.save(
                Puppy
                        .builder(
                        ).name("강아지15")
                        .sex(Sex.MALE)
                        .detailDescription("강아지15 자세한 소개글")
                        .summaryDescription("강아지15 간단한 소개글")
                        .photoFileName("강아지15.jpg")
                        .voteCount(0)
                        .build());
    }


}
