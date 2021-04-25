package com.stackroute.RestserviceMySql.controller;

import com.stackroute.RestserviceMySql.model.Employee;
import com.stackroute.RestserviceMySql.service.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")

public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl service;
    @PostMapping("employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(service.addEmployee(employee), HttpStatus.CREATED);
    }
    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return service.getAllEmployee();
    }
    @GetMapping("byId/{id}")
    public ResponseEntity<Employee> employeebyid(@PathVariable int id){
        return new ResponseEntity<Employee>(service.findEmpById(id),HttpStatus.FOUND);
    }
    @GetMapping("byName/{name}")
    public ResponseEntity<Employee> employeebyname(@PathVariable String name){
        return new ResponseEntity<Employee>(service.findEmpByName(name),HttpStatus.FOUND);
    }
}
