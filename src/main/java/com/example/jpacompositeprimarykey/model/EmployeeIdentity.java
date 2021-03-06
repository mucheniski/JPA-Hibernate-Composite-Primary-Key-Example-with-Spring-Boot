package com.example.jpacompositeprimarykey.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EmployeeIdentity implements Serializable {

    @NotNull
    private String employeeId;

    @NotNull
    private String companyId;

}
