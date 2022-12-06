package com.NeST.EmployeeApp.dao;

import com.NeST.EmployeeApp.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
