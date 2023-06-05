package com.deepdive.puppypopularvote.global.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ResultCode {

    // Puppy
    PUPPY_LIST_FIND_SUCCESS(HttpStatus.OK, "강아지 목록 조회 성공"),
    PUPPY_DETAIL_FIND_SUCCESS(HttpStatus.OK, "강아지 상세 조회 성공"),
    PUPPY_VOTE_SUCCESS(HttpStatus.OK, "강아지 투표 성공");

    private HttpStatus httpStatus;
    private final String message;
}
