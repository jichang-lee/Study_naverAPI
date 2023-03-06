package org.spring.openapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NaverAPIController {

    @GetMapping({"/","/index"})
    public String index(){
        return "index";
    }

}
