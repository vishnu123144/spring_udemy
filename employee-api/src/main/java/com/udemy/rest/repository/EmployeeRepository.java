package com.udemy.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udemy.rest.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
