package com.brijlab.services;

public class QuantityMeasurementException extends Exception {

    public enum ExceptionType {
        NULL_POINTER_EXCEPTION;
    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type,String message) {
        super(message);
        this.type = type;
    }
}
