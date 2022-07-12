package com.cognizant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.exception.EmployeeNotFoundException;
import com.cognizant.model.Employee;
import com.cognizant.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<Employee> getEmployees() {
		log.info("start");
		List<Employee> employees=repository.findAll();
		log.debug("Employees are :{}",employees);
		log.info("end");
		return employees;
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
		log.info("start");
		return repository.findById(id)
				.orElseThrow(()-> new EmployeeNotFoundException("Employee with the id "+id+" doesn't exist"));
	}

	@Override
	public String deleteEmployeeById(int id) throws EmployeeNotFoundException {
		log.info("start");
		Optional<Employee> empop=repository.findById(id);
		
		if(!empop.isPresent()) {
			throw new EmployeeNotFoundException("Employee with the id "+id+" doesn't exist");
		}else {
			repository.deleteById(id);
			log.debug("deleted successfully {}",(List<Employee>) empop.get());
		}
		log.info("End");
		return id+ " deleted successfully....";
	}

	@Override
	public String addEmployee(Employee e) throws EmployeeNotFoundException {
		log.info("start");
		Optional<Employee> empop=repository.findById(e.getId());
		
		if(empop.isPresent()) {
			throw new EmployeeNotFoundException("Employee with the id "+e.getId()+" already exist");
		}else {
			repository.save(e);
			log.debug("employee saved sucessfully {}",e);
		}
		log.info("End");
		return e+ "\nadded successfully....";
	}

	@Override
	public String updateEmployee(Employee e) throws EmployeeNotFoundException {
		log.info("start");
		Optional<Employee> empop=repository.findById(e.getId());
		Employee emp=null;
		if(!empop.isPresent()) {
			throw new EmployeeNotFoundException("Employee with the id "+e.getId()+" doesn't exist for update");
		}else {
			emp=empop.get();
			emp.setId(e.getId());
			emp.setName(e.getName());
			emp.setAge(e.getAge());
			emp.setDoj(e.getDoj());
			emp.setSalary(e.getSalary());
			emp.setGender(e.getGender());
			repository.save(emp);
			log.debug("updated successfully {}",emp);
		}
		log.info("End");
		return emp+ "\n updated successfully....";
	}

	@Override
	public List<Employee> getEmployeeBasedSalaryRange(double lower, double higher) {
		log.info("start");
		List<Employee> employees=repository.findEmployeeBySalaryBetween(lower, higher);
		log.debug("Employees are :{}",employees);
		log.info("end");
		return employees;
	}

	

}
