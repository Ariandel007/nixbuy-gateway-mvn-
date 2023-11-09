package com.mvnnixbuyapi.gatewayservice.exceptions;


public class JwtTokenMalformedException extends GeneralException {

    public JwtTokenMalformedException(String errorCode, String message) {
        super(errorCode, message);
    }
}
