package com.deepdive.puppypopularvote.global.response;

import com.deepdive.puppypopularvote.global.code.ResultCode;
import lombok.Getter;
import org.springframework.http.ResponseEntity;

@Getter
public class ResultResponse {

    private int status;
    private String message;
    private Object data;


    private ResultResponse(final ResultCode resultCode, final Object data) {
        this.status = resultCode.getHttpStatus().value();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    private ResultResponse(final ResultCode resultCode) {
        this.status = resultCode.getHttpStatus().value();
        this.message = resultCode.getMessage();
        this.data = "";
    }

    public static ResultResponse of(final ResultCode resultCode) {
        return new ResultResponse(resultCode);
    }

    public static ResultResponse of(final ResultCode resultCode, final Object data) {
        return new ResultResponse(resultCode, data);
    }

    public static ResponseEntity<ResultResponse> toResponseEntity(final ResultCode resultCode) {
        return ResponseEntity
                .status(resultCode.getHttpStatus())
                .body(
                        ResultResponse.of(resultCode)
                );
    }

    public static ResponseEntity<ResultResponse> toResponseEntity(final Object data, final ResultCode resultCode) {
        return ResponseEntity
                .status(resultCode.getHttpStatus())
                .body(
                        ResultResponse.of(resultCode, data)
                );
    }

}
