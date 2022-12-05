package com.NeST.EmployeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String home(){
        return "welcome to home page of employee db";
    }

    @GetMapping("/add")
    public String add(){
        return "add values";
    }

    @GetMapping("/view")
    public String view()
    {
        return "view values";
    }

    @GetMapping("/serch")
    public String serch(){
        return "serch heare...";
    }
}



