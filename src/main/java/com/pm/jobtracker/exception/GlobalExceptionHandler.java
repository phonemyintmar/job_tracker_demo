package com.pm.jobtracker.exception;

import com.pm.jobtracker.response.ResponseCode;
import com.pm.jobtracker.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
// for handling global expetions, @restcontrolleradvice is enough, d extend htr tae class ka just some kind of
// spring default base class for handling exceptions, if we want to change or extend some behaviors we can extend like this
// if not, we can just name the class globalexhandlder and put a restcontrolleradvice annotation and we're fine.
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final String UNKNOWN_ERROR_MSG = "Some uncaught error happened. Reason: {}";


    //maybe we need to put this to out sone? because it is exception base class? idk not sure.
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGlobalException(Exception ex) {
        log.error(UNKNOWN_ERROR_MSG, ex.getMessage());
        ex.printStackTrace();
        return ResponseUtil.onError(ResponseCode.FAIL, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
