package com.deepdive.puppypopularvote.puppy.controller;

import com.deepdive.puppypopularvote.global.code.ResultCode;
import com.deepdive.puppypopularvote.global.response.ResultResponse;
import com.deepdive.puppypopularvote.puppy.dto.PuppyDto;
import com.deepdive.puppypopularvote.puppy.service.PuppyService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PuppyController {

    private final PuppyService puppyService;

    // http://localhost:8081/puppies?size=10&page=10&sort=id,desc
    // Page request [number: 10, size 10, sort: id: DESC]
    @GetMapping(value = "/puppies")
    public ResponseEntity findPuppies(final Pageable pageable) { // Todo : request dto 로 반환받기
        return ResultResponse.toResponseEntity(puppyService.findPuppies(pageable), ResultCode.PUPPY_LIST_FIND_SUCCESS);
    }

    @GetMapping(value = "/puppies/{id}")
    public ResponseEntity findPuppy(@PathVariable("id") final Long id) {
        return ResultResponse.toResponseEntity(puppyService.findPuppyById(id), ResultCode.PUPPY_DETAIL_FIND_SUCCESS);
    }

    @PostMapping(value = "/puppies/vote")
    public ResponseEntity vote(@RequestBody final PuppyDto.VoteRequest voteRequest) {
        System.out.println("voteRequest.toString() : " + voteRequest.toString());
        System.out.println("voteRequest.getId() : " + voteRequest.getId());
        System.out.println("voteRequest.getVoteStatus() : " + voteRequest.getVoteStatus());


        puppyService.vote(voteRequest.getId(), voteRequest.getVoteStatus());

        /*
        Todo : 성공일 경우 응답값. data 값 빼고 줘야함
        {
            "status": 200,
            "message": "강아지 투표 성공",
            "data": ""
        }
        */
        return ResultResponse.toResponseEntity(ResultCode.PUPPY_VOTE_SUCCESS);
    }


    @GetMapping(value = "/puppies/insert")
    public ResponseEntity insert() {
        puppyService.createPuppys();
        return null;
    }

}
