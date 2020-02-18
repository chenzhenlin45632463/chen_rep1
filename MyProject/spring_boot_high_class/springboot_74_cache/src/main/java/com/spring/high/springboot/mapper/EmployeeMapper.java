package com.spring.high.springboot.mapper;

import com.spring.high.springboot.bean.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmployeeMapper {


    @Select(value = "select *from employee where id=#{id}")
    public Employee getEmpById(Integer id);

    @Update(value = "update employee set lastName=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id = #{id}")
    public void updateEmp(Employee employee);

    @Delete(value = "delete from employee where id=#{id}")
    public void deleteEmp(Integer id);


    @Insert(value = "insert into employee(lastName,email,gender,d_id) values (#{lastName},#{email},#{gender},#{dId})")
    public void insertEmp(Employee employee);
}
