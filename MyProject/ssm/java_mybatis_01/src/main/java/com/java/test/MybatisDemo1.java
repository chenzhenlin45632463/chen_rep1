package com.java.test;


import com.java.dao.DepartmentDao;
import com.java.model.Department;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisDemo1 {
    public static void main(String[] args)throws Exception {
        //解析配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //构造工厂对象(工厂模式)
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //利用工厂生成SqlSession对象
        SqlSession sqlSession = factory.openSession(true);
        //利用SqlSession生成dao的代理对象
        DepartmentDao addressDao = sqlSession.getMapper(DepartmentDao.class);
        //查询
        List<Department> list = addressDao.findAll();
        for (Department address : list) {
            System.out.println(address);
        }
        //释放资源
        sqlSession.close();
        in.close();
    }
}
