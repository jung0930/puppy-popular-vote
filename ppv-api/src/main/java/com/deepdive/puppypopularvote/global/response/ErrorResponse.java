package com.deepdive.puppypopularvote.global.response;

import com.deepdive.puppypopularvote.global.code.ErrorCode;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {

    private String error;
    private int status;
    private String message;

    private ErrorResponse(final ErrorCode errorCode) {
        this.error = errorCode.name();
        this.status = errorCode.getHttpStatus().value();
        this.message = errorCode.getMessage();
    }

    public static ErrorResponse of(final ErrorCode code) {
        return new ErrorResponse(code);
    }

    public static ResponseEntity<ErrorResponse> toResponseEntity(final ErrorCode errorCode){
        return ResponseEntity
                .status(errorCode.getHttpStatus())
                .body(
                        ErrorResponse.of(errorCode)
                );
    }

}
