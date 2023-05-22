package com.deepdive.vote.service.impl;

import com.deepdive.vote.domain.code.Sex;
import com.deepdive.vote.dto.PuppyDto;
import com.deepdive.vote.entity.Puppy;
import com.deepdive.vote.exception.NotFoundPuppyDetailException;
import com.deepdive.vote.repository.PuppyRepository;
import com.deepdive.vote.service.PuppyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PuppyServiceImpl implements PuppyService {

    private final PuppyRepository puppyRepository;
    private final ModelMapper modelMapper;

    @Override
    public PuppyDto.ListResponse findPuppies() {
        List<Puppy> puppies = puppyRepository.findAllBy().get();

        List<PuppyDto.Detail> puppyDtos = puppies.stream()
                .map(puppy -> modelMapper.map(puppy, PuppyDto.Detail.class))
                .collect(Collectors.toList());

        return new PuppyDto.ListResponse(puppyDtos);
    }

    @Override
    public PuppyDto.InfoResponse findPuppyById(Long id) {
        Puppy puppy = puppyRepository.findById(id).orElseThrow(
                () -> new NotFoundPuppyDetailException()
        );

        PuppyDto.InfoResponse puppyDto = modelMapper.map(puppy, PuppyDto.InfoResponse.class);

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
