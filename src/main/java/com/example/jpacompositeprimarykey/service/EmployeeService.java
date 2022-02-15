package com.example.jpacompositeprimarykey.service;

import com.example.jpacompositeprimarykey.model.Employee;
import com.example.jpacompositeprimarykey.model.EmployeeIdentity;
import com.example.jpacompositeprimarykey.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee findById(String employeeId, String companyId) {
        EmployeeIdentity employeeIdentity = new EmployeeIdentity(employeeId, companyId);
        return repository.findById(employeeIdentity).orElseThrow(() -> new RuntimeException("Not Found"));
    }

}
