package com.projekt.pakowanie.pakowanie.wyjątki;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class controlerhandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(podstawowewyjatki.class)
    public ResponseEntity<Object> handleWebExeption(RuntimeException e, WebRequest webRequest) {

        return handleExceptionInternal(e, e.getMessage(), HttpHeaders.EMPTY, HttpStatus.INTERNAL_SERVER_ERROR, webRequest);
    }
}
