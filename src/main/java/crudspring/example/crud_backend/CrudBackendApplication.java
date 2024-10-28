package crudspring.example.crud_backend;

import crudspring.example.crud_backend.entity.Employee;
import crudspring.example.crud_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		Employee employee1 = Employee.builder()
				.firstName("John")
				.lastName("Doe")
				.email("mazzahudson05@outlook.com").build();

		Employee employee2 = Employee.builder()
				.firstName("Tony")
				.lastName("Stark")
				.email("tonhaostark@outlook.com").build();
	}
}
