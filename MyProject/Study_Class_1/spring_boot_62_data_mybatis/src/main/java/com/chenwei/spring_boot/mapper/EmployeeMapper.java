package com.chenwei.spring_boot.mapper;


import com.chenwei.spring_boot.bean.Employee;

//@Mapper
// 或者@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
