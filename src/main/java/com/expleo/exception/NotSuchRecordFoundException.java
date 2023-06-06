package com.expleo.exception;

public class NotSuchRecordFoundException extends  RuntimeException{
    public NotSuchRecordFoundException(){
        super("NotSuchRecordFoundException");
    }
    public NotSuchRecordFoundException(String msg){
        super(msg);
    }
}
