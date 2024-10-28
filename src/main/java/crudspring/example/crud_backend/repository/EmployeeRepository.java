package crudspring.example.crud_backend.repository;

import crudspring.example.crud_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// here we are passing two args, the type of class and the type or the PK
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
