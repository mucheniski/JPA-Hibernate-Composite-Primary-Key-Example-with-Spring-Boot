package com.example.jpacompositeprimarykey.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    /*
    * In the Employee class, We use @EmbeddedId annotation to embed the EmployeeIdentity type and mark it as a primary key.
    * */
    @EmbeddedId
    private EmployeeIdentity employeeIdentity;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

}
