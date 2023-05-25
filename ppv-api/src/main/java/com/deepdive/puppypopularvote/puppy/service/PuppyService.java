package com.deepdive.puppypopularvote.puppy.service;

import com.deepdive.puppypopularvote.puppy.dto.PuppyDto;

public interface PuppyService {

    void createPuppys();

    PuppyDto.ListResponse findPuppies();

    PuppyDto.DetailResponse findPuppyById(Long id);

}
