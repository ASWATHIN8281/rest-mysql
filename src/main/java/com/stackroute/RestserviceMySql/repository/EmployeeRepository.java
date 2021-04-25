package com.stackroute.RestserviceMySql.repository;

import com.stackroute.RestserviceMySql.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    Employee findById(int id);
    Employee findByName(String name);
}
