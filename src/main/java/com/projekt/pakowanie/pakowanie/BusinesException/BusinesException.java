package com.projekt.pakowanie.pakowanie.BusinesException;

public class BusinesException extends RuntimeException {

public BusinesException(){}
public BusinesException(String message){
    super(message);
}
public BusinesException(String message, Throwable cause){
   super(message,cause);

}
public BusinesException(Throwable cause){
    super(cause);


}
public BusinesException(String message, Throwable cause,boolean enableSuppresion,boolean writableStackTree){
    super (message,cause,enableSuppresion,writableStackTree);
}



}
