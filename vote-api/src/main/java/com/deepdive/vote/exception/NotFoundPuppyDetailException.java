package com.deepdive.vote.exception;

public class NotFoundPuppyDetailException extends IllegalArgumentException {

    private static final String NOT_FOUNT_PUPPY_DETAIL_ERROR_MESSAGE = "해당 ID의 정보가 없습니다.";

    public NotFoundPuppyDetailException() {
        super(NOT_FOUNT_PUPPY_DETAIL_ERROR_MESSAGE);
    }

}