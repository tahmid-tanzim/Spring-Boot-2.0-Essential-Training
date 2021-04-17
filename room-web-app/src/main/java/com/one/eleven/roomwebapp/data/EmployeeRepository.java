package com.one.eleven.roomwebapp.data;

import com.one.eleven.roomwebapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
