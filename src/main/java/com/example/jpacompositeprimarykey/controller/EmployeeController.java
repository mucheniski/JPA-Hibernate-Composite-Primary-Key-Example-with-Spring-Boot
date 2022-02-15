package com.example.jpacompositeprimarykey.controller;

import com.example.jpacompositeprimarykey.model.Employee;
import com.example.jpacompositeprimarykey.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public String test() {
        return "OK";
    }

    @GetMapping(value = "/findById")
    public ResponseEntity<Employee> findById(@RequestParam("employeeId") String employeeId, @RequestParam("companyId") String companyId) {
        Employee employee = service.findById(employeeId, companyId);
        return ResponseEntity.ok(employee);
    }

    @GetMapping(value = "/findByEmployeeIdentityCompanyId")
    public ResponseEntity<List<Employee>> findByEmployeeIdentityCompanyId(@RequestParam("companyId") String companyId) {
        List<Employee> employees = service.findByEmployeeIdentityCompanyId(companyId);
        return ResponseEntity.ok(employees);
    }

}
