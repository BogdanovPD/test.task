package org.murano.software.test.task.service;

import org.murano.software.test.task.model.Department;
import org.murano.software.test.task.model.Employee;

import java.util.List;

public interface EmployeeService {
     Employee getEmployeeById(Long id);
     List<Employee> findAll();
     List<Employee> findAllByDepartmentId(Long departmentId);
     Employee save(Employee employee);
     void delete(Long id);
}
