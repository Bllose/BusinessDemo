package org.example.errors;

public class BusinessException extends Exception{
    String code;

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

    BusinessException(String code, String message, Throwable t) {
        super(message, t);
        this.code = code;
    }
}
