package com.etreetech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/etreetech")
    public String home(){
        return "homepage_1";
    }


}
