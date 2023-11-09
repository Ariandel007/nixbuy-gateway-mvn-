package com.mvnnixbuyapi.gatewayservice.exceptions;

public class JwtTokenMissingException extends GeneralException {
    public JwtTokenMissingException(String errorCode, String message) {
        super(errorCode, message);
    }
}
