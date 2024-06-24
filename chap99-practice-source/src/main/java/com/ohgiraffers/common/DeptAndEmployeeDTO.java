package com.ohgiraffers.common;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class DeptAndEmployeeDTO {

    private String id;
    private String title;
    private String locationId;

    private List<EmployeeDTO> empList;
}
