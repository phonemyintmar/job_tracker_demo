package com.pm.jobtracker.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class ResponseCode {

    //success response codes start with zeros
    public static final ResponseCodeDto SUCCESS = new ResponseCodeDto("0000", "Action is successful");

    //error codes start with nines
    public static final ResponseCodeDto FAIL = new ResponseCodeDto("9999", "Something went wrong");

    public static final ResponseCodeDto WRONG_REQUEST = new ResponseCodeDto("9000", "Wrong request");

    public static final ResponseCodeDto INTERNAL_SERVER_ERROR = new ResponseCodeDto("9001", "Internal server error");


    @AllArgsConstructor
    public static class ResponseCodeDto {

        private String code;
        private String msg;

        // getter pl lote yin private getter phyt ny loh use loh m ya
        public String code() {
            return code;
        }

        public String msg() {
            return msg;
        }

    }
}
