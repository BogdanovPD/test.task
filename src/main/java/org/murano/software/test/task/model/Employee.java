package org.murano.software.test.task.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "departmentId")
    private Department department;
}
