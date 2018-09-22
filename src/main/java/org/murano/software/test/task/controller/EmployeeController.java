package org.murano.software.test.task.controller;

import org.murano.software.test.task.model.Department;
import org.murano.software.test.task.model.Employee;
import org.murano.software.test.task.service.DepartmentService;
import org.murano.software.test.task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    private final DepartmentService departmentService;

    @Autowired
    public EmployeeController(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<Employee> getAll() {
       return employeeService.findAll();
    }

    @GetMapping("{id}")
    public Employee getById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/department/{id}")
    public List<Employee> getByDepartment(@PathVariable Long id) {
        return employeeService.findAllByDepartmentId(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        if (employeeService.getEmployeeById(employee.getId()) == null) {
            employeeService.save(employee);
        }
        return employee;
    }

    @PutMapping("{id}/department/{depId}")
    public Employee setDepartment(@PathVariable Long id, @PathVariable Long depId) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee == null) {
            return null;
        }
        Department department = departmentService.getById(depId);
        employee.setDepartment(department);
        return employeeService.save(employee);
    }

    @PutMapping("{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.save(employee);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }

}
