package com.deepdive.vote.service;

import com.deepdive.vote.dto.PuppyDto;

public interface PuppyService {

    void createPuppys();

    PuppyDto.ListResponse findPuppies();

    PuppyDto.InfoResponse findPuppyById(Long id);

}
