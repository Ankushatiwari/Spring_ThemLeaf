package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @GetMapping("/showEmployeeForm")
    public String showForm(Model theModel){
        theModel.addAttribute("employee",new Employee());
        return "employee-form";
    }

    @PostMapping("/processEmployeeForm")
    public String letsgetEmployeeDetails(@ModelAttribute("employee") Employee theEmployee){

        System.out.println("Employee Name : "+theEmployee.getFirstName()+" "+theEmployee.getLastName());

        return "employee-confirm";
    }
}
