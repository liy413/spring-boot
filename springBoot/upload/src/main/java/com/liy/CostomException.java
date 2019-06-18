package com.liy;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CostomException {

    @InitBinder("a")
    public void a(WebDataBinder binder){
        binder.setFieldDefaultPrefix("a.");
    }

    @InitBinder("b")
    public void b(WebDataBinder binder){
        binder.setFieldDefaultPrefix("b.");
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView error(Exception e){
        ModelAndView m = new ModelAndView();
        m.addObject("myerror",e.getMessage());
        m.setViewName("error");
        return m;
    }

    @ModelAttribute
    public Map<String ,String> maps(){
        HashMap<String,String> map = new HashMap<>();
        map.put("name","liy");
        map.put("address","gushu");
        return map;
    }
}
