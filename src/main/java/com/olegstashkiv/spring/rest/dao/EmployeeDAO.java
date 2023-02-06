package com.olegstashkiv.spring.rest.dao;

import com.olegstashkiv.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public  Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
