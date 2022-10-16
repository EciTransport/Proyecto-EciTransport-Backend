package com.proyecto.eciTransport.repositories;

public class ECITransportException extends Exception{

    public ECITransportException(String message) {
        super(message);
    }

    public ECITransportException(String message, Throwable cause) {
        super(message, cause);
    }
}
