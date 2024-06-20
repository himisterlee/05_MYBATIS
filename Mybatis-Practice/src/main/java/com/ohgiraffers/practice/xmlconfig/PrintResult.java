package com.ohgiraffers.practice.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printEmployeeList(List<EmployeeDTO> employeeList) {

        for (EmployeeDTO emp : employeeList) {
            System.out.println(emp);
        }
    }

    public void printEmployee(EmployeeDTO emp) {
        System.out.println(emp);
    }

    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "신규 직원 등록에 성공했습니다.";
                break;
            case "update":
                successMessage = "직원정보 수정에 성공했습니다.";
                break;
            case "delete":
                successMessage = "직원정보 삭제에 성공했습니다.";
                break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList":
                errorMessage = "직원 목록 조회에 실패했습니다.";
                break;
            case "selectOne":
                errorMessage = "직원 조회에 실패했습니다.";
                break;
            case "insert":
                errorMessage = "신규 직원 등록에 실패했습니다.";
                break;
            case "update":
                errorMessage = "직원정보 수정에 실패했습니다.";
                break;
            case "delete":
                errorMessage = "직원정보 삭제에 실패했습니다.";
                break;
        }

        System.out.println(errorMessage);
    }
}