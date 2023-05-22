package com.deepdive.vote.controller;

import com.deepdive.vote.dto.PuppyDto;
import com.deepdive.vote.service.PuppyService;
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

        return new ResponseEntity(puppyDto, HttpStatus.OK);
    }

    @GetMapping(value="/puppies/{id}")
    public ResponseEntity<PuppyDto.InfoResponse> findPuppy(@PathVariable("id") Long id) {
        PuppyDto.InfoResponse puppyDto = puppyService.findPuppyById(id);

        return new ResponseEntity(puppyDto, HttpStatus.OK);
    }

}
