package com.pm.jobtracker.exception;

import com.pm.jobtracker.response.ResponseCode;

public class CustomJobTrackingException extends Exception {

    private final ResponseCode.ResponseCodeDto responseCodeDto;

    public CustomJobTrackingException(ResponseCode.ResponseCodeDto responseCode) {
        super(responseCode.msg());
        this.responseCodeDto = responseCode;
    }

    public ResponseCode.ResponseCodeDto getResponseCode() {
        return responseCodeDto;
    }
}
