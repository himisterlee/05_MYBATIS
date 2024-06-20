package com.ohgiraffers.practice.xmlconfig;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("=========== 임직원 관리 시스템 ===========");
            System.out.println("1. 모든 직원 조회하기");
            System.out.println("2. 직원 번호로 조회하기");
            System.out.println("3. 직원 이름으로 조회하기");
            System.out.println("4. 직원 추가하기");
            System.out.println("5. 직원 정보 수정하기");
            System.out.println("6. 직원정보 삭제하기");
            System.out.print("원하시는 메뉴의 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: EmployeeController.selectAllEmployee(); break;
                case 2: EmployeeController.selectEmployeeByCode(inputEmployeeCode); break;
                case 3: EmployeeController.selectEmployeeByName(inputEmployeeName); break;
                case 4: EmployeeController.registEmployee(inputEmployee); break;
                case 5: EmployeeController.modifyEmployee(inputModifyEmployee); break;
                case 6: EmployeeController.deleteEmployee(inputEmployeeCode); break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
                    break;
            }
        } while (true);
    }

    private static Map<String, String> inputEmployeeCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원의 번호를 입력하세요 : ");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;

    }

    private static Map<String, String> inputEmployeeName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원의 성함를 입력하세요 : ");
        String name = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);

        return parameter;

    }

    private static Map<String, String> inputEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.print("사원번호를 입력하세요 : ");
        String code = sc.nextLine();
        System.out.print("직원의 성함을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("직원의 주민등록번호를 입력하세요(-포함) : ");
        String num = sc.nextLine();
        System.out.print("직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("직원의 전화번호를 입력하세요(-미포함) : ");
        String phoneNum = sc.nextLine();
        System.out.print("직원의 부서코드를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("직원의 직급코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("직원의 급여등급을 입력하세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("직원의 급여를 입력하세요 : ");
        String salary = sc.nextLine();
        System.out.print("직원의 보너스율을 입력하세요 : ");
        String bonus = sc.nextLine();
        System.out.print("직원의 매니저 ID 를 입력하세요 : ");
        String mngId = sc.nextLine();
        System.out.print("직원의 입사일을 입력하세요(YYYY-MM-DD) : ");
        String hire = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("num", num);
        parameter.put("email", email);
        parameter.put("phoneNum", phoneNum);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("mngId", mngId);
        parameter.put("hire", hire);

        return parameter;

    }

    private static Map<String, String> inputModifyEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.println("수정할 직원의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("수정할 직원의 주민등록번호를 입력하세요 : ");
        String num = sc.nextLine();
        System.out.println("수정할 직원의 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.println("수정할 직원의 전화번호를 입력하세요 : ");
        String phoneNum = sc.nextLine();
        System.out.println("수정할 직원의 부서코드를 입력하세요 : ");
        String deptCode = sc.nextLine();
        System.out.println("수정할 직원의 직급코드를 입력하세요 : ");
        String jobCode = sc.nextLine();
        System.out.println("수정할 직원의 급여등급을 입력하세요 : ");
        String salLevel = sc.nextLine();
        System.out.println("수정할 직원의 급여를 입력하세요 : ");
        String salary = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("name", name);
        parameter.put("num", num);
        parameter.put("email", email);
        parameter.put("phoneNum", phoneNum);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);

        return parameter;

    }


}
