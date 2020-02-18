package com.chenwei.spring_boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringBoot62DataMybatisApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {

        System.out.println("数据源class："+dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println("其中连接："+connection);
        connection.close();
    }

}
