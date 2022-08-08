package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capg.model.Employee;



@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
