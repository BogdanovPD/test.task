package org.murano.software.test.task.repository;

import org.murano.software.test.task.model.Department;
import org.murano.software.test.task.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department getDepartmentById(Long id);
}
