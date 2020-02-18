package com.spring.high.springboot.controller;

import com.spring.high.springboot.bean.Employee;
import com.spring.high.springboot.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
    public Employee getById(@PathVariable Integer id) {
        return employeeService.getEmp(id);
    }


    @GetMapping(value = "/emp")
    public Employee update(Employee employee){

        return employeeService.updateEmp(employee);
    }


    @GetMapping(value = "/deleteEmp")
    public String delete(Integer id){
        employeeService.deleteEmp(id);

        return "success";
    }
}
