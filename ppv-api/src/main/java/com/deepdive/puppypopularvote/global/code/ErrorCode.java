package com.deepdive.puppypopularvote.global.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    // Common
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "internal server error"),

    // Puppy
    PUPPY_NOT_FOUND(HttpStatus.NOT_FOUND, "해당 id의 강아지를 찾을 수 없습니다.");

    private final HttpStatus httpStatus;
    private final String message;

}