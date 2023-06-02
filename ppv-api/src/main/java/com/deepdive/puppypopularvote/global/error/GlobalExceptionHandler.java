package com.deepdive.puppypopularvote.global.error;

import com.deepdive.puppypopularvote.global.code.ErrorCode;
import com.deepdive.puppypopularvote.global.error.exception.BusinessException;
import com.deepdive.puppypopularvote.global.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 비즈니스 요구사항에 따른 Exception
    @ExceptionHandler
    protected ResponseEntity<ErrorResponse> handleBusinessException(final BusinessException e) {
        log.error("Exception: ", e);
        return ErrorResponse.toResponseEntity(e.getErrorCode());
    }

    // 그 밖에 발생하는 모든 예외처리가 이곳으로 모인다.
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorResponse> handleException(final Exception e) {
        log.error("Exception: ", e);
        return ErrorResponse.toResponseEntity(ErrorCode.INTERNAL_SERVER_ERROR);
    }

}
