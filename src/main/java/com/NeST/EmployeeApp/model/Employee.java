package com.NeST.EmployeeApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String designstion;
    private int salary;
    private String cmp_name;
    private String mobile;
    private String username;
    private String password;


    public Employee() {
    }

    public Employee(int id, String name, String designstion, int salary, String cmp_name, String mobile, String username, String password) {
        this.id = id;
        this.name = name;
        this.designstion = designstion;
        this.salary = salary;
        this.cmp_name = cmp_name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignstion() {
        return designstion;
    }

    public int getSalary() {
        return salary;
    }

    public String getCmp_name() {
        return cmp_name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }




    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignstion(String designstion) {
        this.designstion = designstion;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCmp_name(String cmp_name) {
        this.cmp_name = cmp_name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
