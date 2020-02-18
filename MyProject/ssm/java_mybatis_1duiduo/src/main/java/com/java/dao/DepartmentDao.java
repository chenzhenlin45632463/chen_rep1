package com.java.dao;


import com.java.model.Department;

import java.util.List;

public interface DepartmentDao {

    List<Department>find(Department department);
}
