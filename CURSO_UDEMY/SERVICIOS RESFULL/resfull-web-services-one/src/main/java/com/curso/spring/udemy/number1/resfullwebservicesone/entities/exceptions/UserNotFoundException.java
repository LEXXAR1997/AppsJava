package com.curso.spring.udemy.number1.resfullwebservicesone.entities.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{

    //public static final String text = "Hola";

    public UserNotFoundException(String message) {
        super(message);
    }

}
