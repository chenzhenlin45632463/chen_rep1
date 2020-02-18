package com.java.test;
import com.java.dao.UserDao;
import com.java.model.BaseEnity;
import com.java.model.User;
import com.java.model.UserTest;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisZiJiXieDemo {
    public static void main(String[] args) throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
        in.close();
    }

    @Before
    public void init() throws IOException {
        System.out.println("初始化");
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }

    private InputStream in=null;
    private SqlSessionFactoryBuilder builder =null;
    private SqlSessionFactory factory = null;
    private SqlSession sqlSession =null;
    private UserDao userDao = null;
    @Test
    public void testAddUser() throws IOException {
        User user = new User();
        user.setName("刘病已");
        user.setAge(67);
        user.setEmail("lby@163.com");
        user.setAddress("皇城");
        user.setNumber("77");
        System.out.println("before:"+user);
//        User test = new User();
        userDao.addUser(user);
        System.out.println("after:"+user);
    }

    @After
    public void destroy() throws IOException {
        System.out.println("结束");
        sqlSession.commit();//提交事务，不然执行不能成功
        sqlSession.close();
        in.close();
    }

    /*模糊查询占位符*/
    @Test
    public void findByName1(){//preparedStatement
        User user = new User();
        user.setName("%刘%");
        List<User> list = userDao.findByName1(user);
        for (User u : list) {
            System.out.println(u);
        }
    }

    /*模糊查询拼接字符*/
    @Test
    public void findByName2(){//statement
        User user = new User();
        user.setName("刘");
        List<User> list = userDao.findByName2(user);
        for (User u : list) {
            System.out.println(u);
        }
    }

    /*pojo包装形式*/
    @Test
    public void findByName3(){//statement
        User user = new User();
        user.setName("%刘%");
        BaseEnity ba = new BaseEnity();
        ba.setUser(user);
        List<User> list = userDao.findByName3(ba);
        for (User u : list) {
            System.out.println(u);
        }
    }

    @Test
    public void findTest(){
        List<UserTest> list = userDao.findTest();
        for (UserTest user : list) {
            System.out.println(user);
        }
    }
}
