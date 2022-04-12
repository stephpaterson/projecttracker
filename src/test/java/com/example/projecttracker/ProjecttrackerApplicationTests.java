package com.example.projecttracker;

import com.example.projecttracker.models.Department;
import com.example.projecttracker.models.Employee;
import com.example.projecttracker.repositories.DepartmentRepository;
import com.example.projecttracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjecttrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department loudTyper = new Department("Loud Typers");
		departmentRepository.save(loudTyper);

		Employee jarrod = new Employee("Jarrod", "Bennie", 123, loudTyper);
		employeeRepository.save(jarrod);

	}




}
