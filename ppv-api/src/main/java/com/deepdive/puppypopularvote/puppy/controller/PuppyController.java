package com.deepdive.puppypopularvote.puppy.controller;

import com.deepdive.puppypopularvote.puppy.dto.PuppyDto;
import com.deepdive.puppypopularvote.puppy.service.PuppyService;
import com.deepdive.puppypopularvote.global.code.ResultCode;
import com.deepdive.puppypopularvote.global.response.ResultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PuppyController {

    private final PuppyService puppyService;

    @GetMapping(value="/puppies") // 페이지 처리해야함
    public ResponseEntity findPuppies(@RequestBody PuppyDto.ListRequest listRequest) {
        // PuppyDto.ListResponse responseDto = puppyService.findPuppies();
        return ResultResponse.toResponseEntity(puppyService.findPuppies(), ResultCode.PUPPY_LIST_FIND_SUCCESS);
    }

    @GetMapping(value="/puppies/{id}")
    public ResponseEntity findPuppy(@PathVariable("id") Long id) {
        // PuppyDto.DetailResponse responseDto = puppyService.findPuppyById(id);
        return ResultResponse.toResponseEntity(puppyService.findPuppyById(id), ResultCode.PUPPY_DETAIL_FIND_SUCCESS);
    }

}
