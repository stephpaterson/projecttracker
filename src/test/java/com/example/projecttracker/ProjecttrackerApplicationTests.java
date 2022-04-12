package com.example.projecttracker;

import com.example.projecttracker.models.Employee;
import com.example.projecttracker.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjecttrackerApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee jarrod = new Employee("Jarrod", "Bennie", 123);
		employeeRepository.save(jarrod);
	}


}
