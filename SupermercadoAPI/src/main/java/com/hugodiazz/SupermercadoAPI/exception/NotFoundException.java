package com.hugodiazz.SupermercadoAPI.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String msj){
        super(msj);
    }
}
