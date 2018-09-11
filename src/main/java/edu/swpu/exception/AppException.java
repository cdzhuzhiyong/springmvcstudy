package edu.swpu.exception;

public class AppException extends Exception {
    private String message;

    public AppException(){}

    public AppException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
