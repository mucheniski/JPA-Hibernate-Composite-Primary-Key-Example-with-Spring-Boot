package com.example.jpacompositeprimarykey.repository;

import com.example.jpacompositeprimarykey.model.Employee;
import com.example.jpacompositeprimarykey.model.EmployeeIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {

    /*
       Spring Data JPA will automatically parse this method name
       and create a query from it
    */
    List<Employee> findByEmployeeIdentityCompanyId(String companyId);

}
