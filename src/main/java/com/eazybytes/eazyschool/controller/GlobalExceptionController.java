package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(annotations = Controller.class)//Restrict that global logic to only the classes that we have
//annotated with @Controller and since our rest controller is annotated with @RestController it wouldn't be applicable to it
public class GlobalExceptionController {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(Exception exception) {
        ModelAndView errorPage = new ModelAndView();
        errorPage.setViewName("error");//view name
        errorPage.addObject("errormsg", exception.getMessage());//data that will sent to UI application
        return errorPage;
    }

}
