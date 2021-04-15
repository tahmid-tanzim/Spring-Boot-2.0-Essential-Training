package com.one.eleven.roomwebapp.service;

import com.one.eleven.roomwebapp.models.Employee;
import com.one.eleven.roomwebapp.models.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    private static final List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(UUID.randomUUID().toString(), "Jim", "Carry", Position.CUSTOMER_SERVICE_REPRESENTATIVE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Ruby", "Margot", Position.MARKETING_EXECUTIVE));
        employees.add(new Employee(UUID.randomUUID().toString(), "Martin", "Chi", Position.RESTAURANT_MANAGER));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
