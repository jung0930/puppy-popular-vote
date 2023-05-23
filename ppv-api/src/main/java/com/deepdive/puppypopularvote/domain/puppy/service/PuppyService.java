package com.deepdive.puppypopularvote.domain.puppy.service;

import com.deepdive.puppypopularvote.domain.puppy.dto.PuppyDto;

public interface PuppyService {

    void createPuppys();

    PuppyDto.ListResponse findPuppies();

    PuppyDto.DetailResponse findPuppyById(Long id);

}
