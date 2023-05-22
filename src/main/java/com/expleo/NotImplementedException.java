package com.expleo;

public class NotImplementedException extends  RuntimeException{
    public NotImplementedException(){
        super("NotImplementedException");
    }
    public NotImplementedException(String msg){
        super(msg);
    }
}
