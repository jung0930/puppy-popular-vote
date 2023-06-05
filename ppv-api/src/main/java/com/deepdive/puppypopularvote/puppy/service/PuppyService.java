package com.deepdive.puppypopularvote.puppy.service;

import com.deepdive.puppypopularvote.code.VoteStatus;
import com.deepdive.puppypopularvote.puppy.dto.PuppyDto;
import org.springframework.data.domain.Pageable;

public interface PuppyService {

    void createPuppys();

    PuppyDto.ListResponse findPuppies(Pageable pageable);

    PuppyDto.DetailResponse findPuppyById(Long id);

    void vote(Long id, VoteStatus voteStatus);

}
