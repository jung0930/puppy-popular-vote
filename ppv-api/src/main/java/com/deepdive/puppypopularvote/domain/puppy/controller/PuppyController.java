package com.deepdive.puppypopularvote.domain.puppy.controller;

import com.deepdive.puppypopularvote.domain.puppy.dto.PuppyDto;
import com.deepdive.puppypopularvote.domain.puppy.service.PuppyService;
import com.deepdive.puppypopularvote.global.code.ResultCode;
import com.deepdive.puppypopularvote.global.response.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PuppyController {

    private final PuppyService puppyService;

    @GetMapping(value="/puppies")
    public ResponseEntity findPuppies() {
        PuppyDto.ListResponse puppyDto = puppyService.findPuppies();

        return ResultResponse.toResponseEntity(puppyDto, ResultCode.PUPPY_LIST_FIND_SUCCESS);
    }

    @GetMapping(value="/puppies/{id}")
    public ResponseEntity findPuppy(@PathVariable("id") Long id) {
        PuppyDto.DetailResponse puppyDto = puppyService.findPuppyById(id);

        return ResultResponse.toResponseEntity(puppyDto, ResultCode.PUPPY_DETAIL_FIND_SUCCESS);
    }

}
