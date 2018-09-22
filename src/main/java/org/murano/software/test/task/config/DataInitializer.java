package org.murano.software.test.task.config;

import lombok.NoArgsConstructor;
import org.murano.software.test.task.model.Department;
import org.murano.software.test.task.model.Employee;
import org.murano.software.test.task.repository.DepartmentRepository;
import org.murano.software.test.task.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DataInitializer {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    private void init() {
        Department department1 = new Department();
        department1.setName("Department 1");
        departmentRepository.save(department1);
        Department department2 = new Department();
        department2.setName("Department 2");
        departmentRepository.save(department2);

        Employee employee1 = new Employee();
        employee1.setFirstName("Pavel");
        employee1.setSurname("Bogdanov");
        employee1.setPhoneNumber("+799999999999");
        employee1.setDepartment(department1);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Ivan");
        employee2.setSurname("Petrov");
        employee2.setPhoneNumber("+7000000000");
        employeeRepository.save(employee2);

    }
}
