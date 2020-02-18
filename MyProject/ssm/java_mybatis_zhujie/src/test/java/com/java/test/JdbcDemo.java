package com.java.test;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/aaa_test1";
        Connection connection = DriverManager.getConnection(url, "root", "root");
//        System.out.println(connection);
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("select * from deptment");
        long l = System.currentTimeMillis();
        while (set.next()){
            System.out.println(set.getInt("id"));
            System.out.println(set.getString("name"));
            System.out.println(set.getString("adress"));
        }
        set.close();
        statement.close();
        connection.close();
    }
}
