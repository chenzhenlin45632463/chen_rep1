package com.java.dao;

import com.java.model.BaseEnity;
import com.java.model.User;
import com.java.model.UserTest;

import java.util.List;

public interface UserDao {
    List<User>findAll();

    void addUser(User user);

    List<User>findByName1(User user);

    List<User>findByName2(User user);

    List<User>findByName3(BaseEnity baseEnity);

    List<UserTest>findTest();
}
