package com.example.jpacompositeprimarykey;

import com.example.jpacompositeprimarykey.model.Employee;
import com.example.jpacompositeprimarykey.model.EmployeeIdentity;
import com.example.jpacompositeprimarykey.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class JpaCompositePrimaryKeyApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaCompositePrimaryKeyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Cleanup employees table
		employeeRepository.deleteAllInBatch();

		// Insert a new Employee in the database
		Employee employee1 = new Employee(new EmployeeIdentity("E-123", "C-457"),
				"Rajeev Kumar Singh",
				"rajeev@callicoder.com",
				"+91-9999999999");

		// Insert a new Employee in the database
		Employee employee2 = new Employee(new EmployeeIdentity("E-321", "C-356"),
				"Darth Vader",
				"vader@callicoder.com",
				"+92-9999999999");

		// Insert a new Employee in the database
		Employee employee3 = new Employee(new EmployeeIdentity("E-462", "C-986"),
				"scorpion",
				"fucksubzero@callicoder.com",
				"+93-9999999999");

		employeeRepository.saveAll(Arrays.asList(employee1, employee2, employee3));
	}
}
