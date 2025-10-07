package com.prince.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prince.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
