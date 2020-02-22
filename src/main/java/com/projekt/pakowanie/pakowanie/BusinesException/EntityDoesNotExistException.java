package com.projekt.pakowanie.pakowanie.BusinesException;

public class EntityDoesNotExistException extends RuntimeException{
public EntityDoesNotExistException(){}
public EntityDoesNotExistException(String message){    super(message);}
public EntityDoesNotExistException(String message, Throwable cause){ super(message,cause);}
public EntityDoesNotExistException(Throwable cause){super(cause); }
public EntityDoesNotExistException(String message,Throwable cause,boolean enableSuppresion, boolean writableStackTree){super(message,cause,enableSuppresion,writableStackTree);}

}
