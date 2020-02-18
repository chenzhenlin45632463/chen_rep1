package com.java.test;


import com.java.dao.DepartmentDao;
import com.java.dao.UserDao;
import com.java.model.Department;
import com.java.model.User;
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

public class MybatisDemo1 {
    public static void main(String[] args)throws Exception {
        long l = System.currentTimeMillis();
        //解析配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //构造工厂对象(工厂模式)
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //利用工厂生成SqlSession对象
        SqlSession sqlSession = factory.openSession();
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

    private UserDao userDao;
    private SqlSession sqlSession ;

    @Before
    public void init() throws IOException {
//解析配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //构造工厂对象(工厂模式)
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //利用工厂生成SqlSession对象
         sqlSession = factory.openSession(true);
        //利用SqlSession生成dao的代理对象
        userDao = sqlSession.getMapper(UserDao.class);
    }
    @Test
    public void findAll(){
        List<User> list = userDao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void save(){
        User user = new User();
        user.setName("李治");
        user.setNumber("36");
        user.setAddress("唐宫");
        user.setAge(34);
        user.setEmail("wzt@163.com");
        System.out.println("b:"+user);
        userDao.save(user);
        System.out.println("a:"+user);
    }

    @Test
    public void findOne(){
        User user = userDao.findById(12);
        System.out.println(user);
    }

    @Test
    public void update(){
        User user = userDao.findById(12);
        user.setName("李阳光");
        user.setEmail("lyg@163.com");
        user.setAddress("汉阳宫");
        userDao.update(user);
    }

    @Test
    public void delete(){
        userDao .delete(18);
    }

    @After
    public void destroy(){
        sqlSession.close();
    }
}
