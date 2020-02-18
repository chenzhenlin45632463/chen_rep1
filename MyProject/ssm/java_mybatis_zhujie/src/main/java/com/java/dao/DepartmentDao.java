package com.java.dao;

import com.java.model.Department;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DepartmentDao {

    @Select("select * from deptment")
    List<Department> findAll();
}
