package com.example.jpacompositeprimarykey.repository;

import com.example.jpacompositeprimarykey.model.Employee;
import com.example.jpacompositeprimarykey.model.EmployeeIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {
}
