package com.pm.jobtracker.response;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class BaseResponse {
    private String code;
    private String message;
    private ZonedDateTime respondedAt;
    private Object result;
}
