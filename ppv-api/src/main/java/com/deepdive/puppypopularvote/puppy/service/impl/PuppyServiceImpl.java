package com.deepdive.puppypopularvote.puppy.service.impl;

import com.deepdive.puppypopularvote.code.Sex;
import com.deepdive.puppypopularvote.entity.Puppy;
import com.deepdive.puppypopularvote.global.error.exception.PuppyNotFoundException;
import com.deepdive.puppypopularvote.puppy.dto.PuppyDto;
import com.deepdive.puppypopularvote.puppy.repository.PuppyRepository;
import com.deepdive.puppypopularvote.puppy.service.PuppyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PuppyServiceImpl implements PuppyService {

    private final PuppyRepository puppyRepository;
    private final ModelMapper modelMapper;

    @Override
    public PuppyDto.ListResponse findPuppies(Pageable pageable) {
        Page<Puppy> puppies = puppyRepository.findAll(pageable);

        Page<PuppyDto.Detail> puppyDtos = puppies.map(puppy -> modelMapper.map(puppy, PuppyDto.Detail.class));

        return PuppyDto.ListResponse.of(puppyDtos);
    }

    @Override
    public PuppyDto.DetailResponse findPuppyById(Long id) {
        Puppy puppy = puppyRepository.findById(id)
                .orElseThrow(() -> new PuppyNotFoundException());

        PuppyDto.DetailResponse puppyDto = modelMapper.map(puppy, PuppyDto.DetailResponse.class);

        return puppyDto;
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
