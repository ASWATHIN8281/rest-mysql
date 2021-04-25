package com.stackroute.RestserviceMySql.service;

import com.stackroute.RestserviceMySql.model.Employee;
import com.stackroute.RestserviceMySql.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;
    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) repository.findAll();
    }

    @Override
    public void deleteEmployee(int id) {
         repository.deleteById(id);

    }

    @Override
    public Employee findEmpById(int id) {
        return repository.findById(id);
    }

    @Override
    public Employee findEmpByName(String name) {
        return repository.findByName(name);
    }
}
