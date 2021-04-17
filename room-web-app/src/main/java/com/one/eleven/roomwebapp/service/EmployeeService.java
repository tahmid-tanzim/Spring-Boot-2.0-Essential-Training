package com.one.eleven.roomwebapp.service;

import com.one.eleven.roomwebapp.data.EmployeeRepository;
import com.one.eleven.roomwebapp.models.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
