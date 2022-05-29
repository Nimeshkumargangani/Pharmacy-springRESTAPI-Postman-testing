package com.pharmacy.springboot;
//Nimeshkumar Gangani 50182

import com.pharmacy.springboot.model.Employee;
import com.pharmacy.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Nimeshkumar");
		employee.setLastName("Gangani");
		employee.setEmailID("nimesh@gmail.com");
		employeeRepository.save(employee);

		//Nimeshkumar Gangani 50182

		Employee employee1 = new Employee();
		employee1.setFirstName("Jhon");
		employee1.setLastName("cena");
		employee1.setEmailID("cena@gmail.com");
		employeeRepository.save(employee1);
	}

}
