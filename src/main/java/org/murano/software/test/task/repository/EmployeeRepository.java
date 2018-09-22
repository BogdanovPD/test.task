package org.murano.software.test.task.repository;

import org.murano.software.test.task.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeById(Long id);

    @Query("select e from Employee as e where e.department.id=:departmentId")
    List<Employee> findAllByDepartmentId(@Param("departmentId") Long departmentId);

    void deleteEmployeeById(Long id);

}
