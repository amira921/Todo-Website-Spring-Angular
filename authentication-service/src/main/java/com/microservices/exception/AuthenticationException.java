package com.authentication.exception;

public class AuthenticationException extends Exception{
    public AuthenticationException(String message){
        super("AuthenticationException: " + message);
    }

    public AuthenticationException(String message, String cause){
        super("AuthenticationException: " + message + "\nCause: " + cause);
    }
}
