package com.ohgiraffers.common;

import lombok.*;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class EmployeeAndDeptDTO {

    private String empId;
    private String name;
    private String empNo;
    private String email;
    private String phone;
    private DeptDTO dept;
    private String jobCode;
    private String salLevel;
    private int salary;
    private double bonus;
    private String mngId;
    private Date hireDate;
    private Date entDate;
    private String entYn;
}
