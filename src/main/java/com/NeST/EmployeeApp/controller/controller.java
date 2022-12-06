package com.NeST.EmployeeApp.controller;

import com.NeST.EmployeeApp.dao.EmployeeDao;
import com.NeST.EmployeeApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> home(){
        return (List<Employee>)dao.findAll();
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String add(@RequestBody Employee e){ //passing the object of specific tables class ie,object of employee class

        System.out.println(e.getName().toString());
        System.out.println(e.getDesignstion().toString());
        System.out.println(e.getCmp_name().toString());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        return "add values";
    }


}





