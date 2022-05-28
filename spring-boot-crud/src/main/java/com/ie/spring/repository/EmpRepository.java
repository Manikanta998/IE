package com.ie.spring.repository;

import com.ie.spring.model.Mani;
import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<Mani, Integer> {
}
