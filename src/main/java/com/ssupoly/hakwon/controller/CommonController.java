package com.ssupoly.hakwon.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class CommonController {
     
	
    @RequestMapping(value="/index")    
    public String root() {
    	System.out.println("index come");
        return "/index";         
    }
    
}



