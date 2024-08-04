package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloWorldController {

    //new a controller method to show initial HTML Form

    @RequestMapping("/showform")
    public String showForm(){
        return "helloworld-form";
    }

    @GetMapping("/showStudentForm")
    public String showStudentForm(){
        return "studentData";
    }

    //need a controller method to process HTML Form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    //need  a controller data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");
        // create the message
        String result = "Yo! " + theName.toUpperCase();;
        // add message to the model
        model.addAttribute("message", result);
        return "helloworld";
    }

    @PostMapping("/processFromVersionThree")
    public String letGetStudentData(@RequestParam("studentFirstName") String theName ,
                                    @RequestParam("studentLastName") String theSurname, Model model){
        String resultName = "Hello " + theName.toUpperCase();
        String resultSurname = "Welcome Mr." + theSurname.toUpperCase();
        model.addAttribute("messageOne",resultName);
        model.addAttribute("messageTwo",resultSurname);
        return "studentDataOutput";
    }




}
