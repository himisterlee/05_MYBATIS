package com.ohgiraffers.practice.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.practice.xmlconfig.Template.getSqlSession;

public class EmployeeService {

    private final EmployeeDAO employeeDAO;

    public EmployeeService() { employeeDAO = new EmployeeDAO(); }

    public List<EmployeeDTO> selectAllEmployee() {

        SqlSession sqlSession = getSqlSession();

        List<EmployeeDTO> employeeList = employeeDAO.selectAllEmployee(sqlSession);

        sqlSession.close();

        return employeeList;
    }

    public EmployeeDTO selectEmployeeByCode(int code) {

        SqlSession sqlSession = getSqlSession();

        EmployeeDTO emp = employeeDAO.selectEmployeeByCode(sqlSession, code);

        sqlSession.close();

        return emp;
    }

    public EmployeeDTO selectEmployeeByName(String name) {

        SqlSession sqlSession = getSqlSession();

        EmployeeDTO emp = employeeDAO.selectEmployeeByName(sqlSession, name);

        sqlSession.close();

        return emp;
    }

    public boolean registEmployee(EmployeeDTO emp) {

        SqlSession sqlSession = getSqlSession();

        int result = employeeDAO.insertEmployee(sqlSession, emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyEmployee(EmployeeDTO emp) {

        SqlSession sqlSession = getSqlSession();

        int result = employeeDAO.updateEmployee(sqlSession, emp);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }


    public boolean deleteEmployee(int code) {

        SqlSession sqlSession = getSqlSession();

        int result = employeeDAO.deleteEmployee(sqlSession, code);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }


}
