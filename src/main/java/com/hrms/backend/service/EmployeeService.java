package com.hrms.backend.service;

import com.hrms.backend.entity.Employee;
import com.hrms.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee updateSalary(Long id, double percentage) {
        Employee emp = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        double increment = emp.getSalary() * percentage / 100;
        emp.setSalary(emp.getSalary() + increment);

        return repository.save(emp);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
