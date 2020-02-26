package com.projekt.pakowanie.pakowanie.wyjątki;

import com.projekt.pakowanie.pakowanie.controler.ProjektController;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDateTime;

@RestController
@ControllerAdvice(assignableTypes= ProjektController.class)
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ControllerHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public final ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException exception,
                                                             WebRequest request) {
     podstawowewyjatki response = new podstawowewyjatki(LocalDateTime.now(), exception.getMessage(),
                request.getDescription(true));
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

    }

}