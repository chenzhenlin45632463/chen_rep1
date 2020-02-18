package com.springboot.spring_boot30.controller;

import com.springboot.spring_boot30.dao.DepartmentDao;
import com.springboot.spring_boot30.dao.EmployeeDao;
import com.springboot.spring_boot30.entities.Department;
import com.springboot.spring_boot30.entities.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.Collection;

@Slf4j
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

    /***
     * 员工列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/emps",method = RequestMethod.GET)
    public String getAll(Model model){
        Collection<Employee> list = employeeDao.getAll();
        model.addAttribute("emps",list);
        return "emp/list";
    }

    /***
     * 进入添加员工页面
     * @return
     */
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String add(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);
        return "emp/add";
    }

    /**
     * 创建员工信息
     */
   @PostMapping(value = "/emp")
    public String create(Employee employee){
        log.info("[create_param]employee={}",employee);
        if (employee!=null){
            employeeDao.save(employee);
        }
        //添加成功后跳转列表页面
        return "redirect:/emps";
    }

    /***
     * 来到编辑页面
     * @param model
     * @return
     */
    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    public String toEditPage(Model model, @PathVariable(value = "id") Integer id){
        log.info("[toEditPage_param]id={}",id);
        Employee employee = employeeDao.get(id);
        log.info("[toEditPage_employee]employee={}",employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps",departments);
        if (null!=employee){
            model.addAttribute("emp",employee);
        }else {
            //用户不存在
         model.addAttribute("editMsg","the employee is exist");
        }
        //add页面是一个修改添加二合一的页面
        return "emp/update";
    }


    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Employee employee){
        log.info("[update_param]employee={}",employee);
        if (employee!=null){
            //修改员工
            employeeDao.save(employee);
        }
        //重定向
        return "redirect:/emps";
    }

}
