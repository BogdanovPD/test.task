package org.murano.software.test.task.service;

import org.murano.software.test.task.model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAll();
    Department getById(Long id);
    Department save(Department department);
    void delete(Department department);
}
