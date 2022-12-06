package com.NeST.EmployeeApp.controller;

import com.NeST.EmployeeApp.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String home(){
        return "welcome to home page of employee db";
    }

    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Employee e){

        System.out.println(e.getName().toString());
        System.out.println(e.getDesignstion().toString());
        System.out.println(e.getCmp_name().toString());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());

        return "add values";
    }


}





