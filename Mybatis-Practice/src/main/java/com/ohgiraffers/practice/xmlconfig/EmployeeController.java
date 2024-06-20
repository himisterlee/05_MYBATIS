package com.ohgiraffers.practice.xmlconfig;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class EmployeeController {

    private final EmployeeService employeeService;
    private final PrintResult printResult;

    public EmployeeController() {
        employeeService = new EmployeeService();
        printResult = new PrintResult();
    }


    public static void selectAllEmployee() {

        List<EmployeeDTO> employeeList = employeeService.selectAllEmployee();

        if(employeeList != null) {
            printResult.printEmployeeList(employeeList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectEmployeeByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        EmployeeDTO emp = EmployeeService.selectEmployeeByCode(code);

        if(emp != null) {
            printResult.printEmployee(emp);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void selectEmployeeByName(Map<String, String> parameter) {

        String name = parameter.get("name");

        EmployeeDTO emp = EmployeeService.selectEmployeeByName(name);

        if(emp != null) {
            printResult.printEmployee(emp);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registEmployee(Map<String, String> parameter) {

        String code = parameter.get("code");
        String name = parameter.get("name");
        String num = parameter.get("num");
        String email = parameter.get("email");
        String phoneNum = parameter.get("phoneNum");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        double salary = Double.parseDouble(parameter.get("salary"));
        double bonus = Double.parseDouble(parameter.get("bonus"));
        String mngId = parameter.get("mngId");
        String hire = parameter.get("hire");

        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmpId(code);
        emp.setEmpName(name);
        emp.setEmpNo(num);
        emp.setEmail(email);
        emp.setPhone(phoneNum);
        emp.setDeptCode(deptCode);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);
        emp.setSalary(salary);
        emp.setBonus(bonus);
        emp.setManagerId(mngId);
        emp.setHireDate(hire);

        boolean result = EmployeeService.registEmployee(emp);

        if(result) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }

    }

    public void modifyEmployee(Map<String, String> parameter) {

        String name = parameter.get("name");
        String num = parameter.get("num");
        String email = parameter.get("email");
        String phoneNum = parameter.get("phoneNum");
        String deptCode = parameter.get("deptCode");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        double salary = Double.parseDouble(parameter.get("salary"));

        EmployeeDTO emp = new EmployeeDTO();
        emp.setEmpName(name);
        emp.setEmpNo(num);
        emp.setEmail(email);
        emp.setPhone(phoneNum);
        emp.setDeptCode(deptCode);
        emp.setJobCode(jobCode);
        emp.setSalLevel(salLevel);
        emp.setSalary(salary);

        boolean result = EmployeeService.modifyEmployee(emp);

        if(result) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }

    }

    public void deleteEmployee(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        boolean result = employeeService.deleteEmployee(code);

        if (result) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
