package com.curso.spring.udemy.number1.resfullwebservicesone.controllers;

import com.curso.spring.udemy.number1.resfullwebservicesone.entities.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET, path = "/hello_world")
    public String HelloWorld(){
        return "Hello world";
    }

    /*@RequestMapping(method = RequestMethod.GET, path = "/hello_world_internationalized")
    public String HelloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false)Locale locale){
        return messageSource.getMessage("good.morning.message", null, "Default message", locale);
    }*/
    @RequestMapping(method = RequestMethod.GET, path = "/hello_world_internationalized")
    public String HelloWorldInternationalized(){
        return messageSource.getMessage("good.morning.message", null, "Default message", LocaleContextHolder.getLocale());
    }

    @GetMapping(path = "/hello_world_bean")
    public HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean("Hello world");
    }

    @GetMapping(path = "/hello_world_bean/path-variable/{name}")
    public HelloWorldBean HelloWorldPath(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world %s", name));
    }
}
