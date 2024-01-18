package com.zeendlovu.management_system.service;

import com.zeendlovu.management_system.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);

    void deleteById(Long id);

}
