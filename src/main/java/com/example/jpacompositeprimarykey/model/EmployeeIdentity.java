package com.example.jpacompositeprimarykey.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeIdentity {

    @NotNull
    private String employeeId;

    @NotNull
    private String companyId;

}
