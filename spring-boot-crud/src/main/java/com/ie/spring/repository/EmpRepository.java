package com.ie.spring.repository;

import com.ie.spring.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Employee, Integer> {
}
