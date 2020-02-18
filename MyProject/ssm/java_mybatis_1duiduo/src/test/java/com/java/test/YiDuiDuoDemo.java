package com.java.test;

import com.java.dao.DepartmentDao;
import com.java.model.Department;
import com.java.model.Eployee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class YiDuiDuoDemo {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession(true);
        DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
        Department department = new Department();
        department.setId(7);
        List<Department> list = departmentDao.find(department);
        for (Department d : list) {
            System.out.println(d);
            System.out.println(d.getEployeeList());

            System.out.println("======================");
        }
    }
}
