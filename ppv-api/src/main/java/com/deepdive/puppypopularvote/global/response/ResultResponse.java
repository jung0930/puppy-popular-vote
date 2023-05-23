package com.deepdive.puppypopularvote.global.response;

import com.deepdive.puppypopularvote.global.code.ResultCode;
import lombok.Getter;
import org.springframework.http.ResponseEntity;

@Getter
public class ResultResponse {

    private int status;
    private String message;
    private Object data;


    private ResultResponse(ResultCode resultCode, Object data) {
        this.status = resultCode.getHttpStatus().value();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    public static ResultResponse of(ResultCode resultCode, Object data) {
        return new ResultResponse(resultCode, data);
    }

    public static ResponseEntity<ResultResponse> toResponseEntity(final Object data, final ResultCode resultCode){
        return ResponseEntity
                .status(resultCode.getHttpStatus())
                .body(
                        ResultResponse.of(resultCode, data)
                );
    }

}
