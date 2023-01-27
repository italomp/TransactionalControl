package com.example.transactionalControl.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.IllegalTransactionStateException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GeneralExceptionHandler {
    @ExceptionHandler(IllegalTransactionStateException.class)
    public ResponseEntity<CustomError> illegalTransactionStateExceptionHandler(Exception ex, WebRequest request){
        CustomError errorMsg = new CustomError(request.getDescription(false), ex.getMessage(), new Date());
        return new ResponseEntity<>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<CustomError> runtimeExceptionHandler(Exception ex, WebRequest request){
        CustomError errorMsg = new CustomError(request.getDescription(false), ex.getMessage(), new Date());
        return new ResponseEntity<>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
