package com.prince.employee.service;

import com.prince.employee.exception.ResourceNotFoundException;
import com.prince.employee.model.Employee;
import com.prince.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployee(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee not found with id " + id));
    }

    public Employee addEmployee(Employee e) {
        return repo.save(e);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}
