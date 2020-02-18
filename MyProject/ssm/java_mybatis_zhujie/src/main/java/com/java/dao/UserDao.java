package com.java.dao;

import com.java.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {

    @Select("select * from sys_user")
    List<User>findAll();

    @Insert("insert into sys_user (name,number,email,age,address) values (#{name},#{number},#{email},#{age},#{address})")
    @SelectKey(keyColumn="id",keyProperty="id",resultType=Integer.class,before = false, statement = { "select last_insert_id()" })
    void save(User user);

    @Select("select * from sys_user where id = #{id}")
    User findById(Integer id);

    @Update("update sys_user u set u.name = #{name},u.number = #{number},u.email=#{email},u.age =#{age},u.address = #{address} where u.id=#{id}")
    void update(User user);

    @Delete("delete from sys_user  where id = #{id}")
    void delete(Integer id);
}
