package com.hrms.backend.service;

import com.hrms.backend.entity.Employee;
import com.hrms.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // CREATE
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // READ
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // UPDATE SALARY (percentage based)
    public Employee updateSalary(Long id, double percentage) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        double newSalary = employee.getSalary() +
                (employee.getSalary() * percentage / 100);
        employee.setSalary(newSalary);
        return employeeRepository.save(employee);
    }

    // DELETE
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
