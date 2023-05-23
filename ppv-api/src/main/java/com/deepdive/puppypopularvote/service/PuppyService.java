package com.deepdive.puppypopularvote.service;

import com.deepdive.puppypopularvote.dto.PuppyDto;

public interface PuppyService {

    void createPuppys();

    PuppyDto.ListResponse findPuppies();

    PuppyDto.InfoResponse findPuppyById(Long id);

}
