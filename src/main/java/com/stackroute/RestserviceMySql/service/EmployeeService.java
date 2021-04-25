package com.stackroute.RestserviceMySql.service;

import com.stackroute.RestserviceMySql.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public void deleteEmployee(int id);
    Employee findEmpById(int id);
    Employee findEmpByName(String name);
}
