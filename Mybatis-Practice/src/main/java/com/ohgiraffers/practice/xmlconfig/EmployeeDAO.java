package com.ohgiraffers.practice.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmployeeDAO {

    public List<EmployeeDTO> selectAllEmployee(SqlSession sqlSession) {

        return sqlSession.selectList("EmployeeMapper.selectAllEmployee");
    }

    public EmployeeDTO selectEmployeeByCode(SqlSession sqlSession, int code) {

        return sqlSession.selectOne("EmployeeMapper.selectEmployeeByCode", code);
    }

    public EmployeeDTO selectEmployeeByName(SqlSession sqlSession, String name) {

        return sqlSession.selectOne("EmployeeMapper.selectEmployeeByName", name);
    }

    public int insertEmployee(SqlSession sqlSession, EmployeeDTO employee) {

        return sqlSession.insert("EmployeeMapper.insertEmployee", employee);
    }

    public int updateEmployee(SqlSession sqlSession, EmployeeDTO employee) {

        return sqlSession.update("EmployeeMapper.updateEmployee", employee);
    }

    public int deleteEmployee(SqlSession sqlSession, int code) {

        return sqlSession.delete("EmployeeMapper.deleteEmployee", code);
    }

}
