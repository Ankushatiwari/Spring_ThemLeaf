package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class democontroller {

@GetMapping("/hello")
    public String sayHello(Model theModel){
    theModel.addAttribute("theDate",java.time.LocalDateTime.now());
    return "helloworld";
}

}


