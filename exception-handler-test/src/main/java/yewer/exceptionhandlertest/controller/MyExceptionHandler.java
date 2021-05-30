package yewer.exceptionhandlertest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler
    public String exceptionHandler(Exception exception){
        System.out.println(exception);
        return "exp";
    }
}
