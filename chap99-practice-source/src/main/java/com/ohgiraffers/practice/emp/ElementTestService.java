package com.ohgiraffers.practice.emp;

import com.ohgiraffers.common.DeptAndEmployeeDTO;
import com.ohgiraffers.common.EmployeeAndDeptDTO;
import com.ohgiraffers.common.EmployeeDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    private ElementTestMapper mapper;

    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<EmployeeAndDeptDTO> empList = mapper.selectResultMapAssociationTest();

        for(EmployeeAndDeptDTO emp : empList) {
            System.out.println("이름 : " + emp.getName() + " / " + "부서 : " + emp.getDept().getTitle());
        }

        sqlSession.close();
    }

    public void selectResultMapCollectionTest() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<DeptAndEmployeeDTO> deptList = mapper.selectResultMapCollectionTest();

//        List<EmployeeDTO> empList = deptList.get(5).getEmpList();
//
//        for(EmployeeDTO emp : empList) {
//            System.out.println(emp);
//        }

        for(DeptAndEmployeeDTO dept : deptList) {
            System.out.println(dept);
        }

        sqlSession.close();
    }
}
