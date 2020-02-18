package com.spring.high.springboot.service;

import com.spring.high.springboot.bean.Employee;
import com.spring.high.springboot.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    /**
     * @Cacheable 将方法的结果进行缓存，以后再查询相同的结果，直接从缓存中获取，不用调用方法
     *
     *CacheManager管理多个Cache组件，在Cache组件中对缓存进行crud操作，每个缓存组件有自己唯一的一个名字
     *
     * 几个属性：
     *  cacheNames/value：指定缓存组件的名字
     *  key：缓存数据使用的key可以用它来指定；默认值为方法参数id的值
     *  keyGenerator：key的生成器；可以自己指定key的生成器的组件id
     *              key/keyGenerator:二选一使用
     *  cacheManager：指定缓存管理器；或者cacheResolver指定获取解析器
     *  condition：指定符合条件的情况才缓存；
     *  unless：否定缓存；与condition相反
     *  sync：是否使用异步模式
     * @param id
     * @return
     */
    @Cacheable(cacheNames = {"emp"}/*,key = "#root.methodName+'['+#id+']'",condition = "#a0>1"*/)
    public Employee getEmp(Integer id){

        log.info("select :"+id+"_employee");
        return employeeMapper.getEmpById(id);
    }

    @CachePut(value = "emp",key = "#a0.id")
    public Employee updateEmp(Employee employee){
        employeeMapper.updateEmp(employee);
        return employee;
    }

    @CacheEvict(value = "emp",key = "#id")
    public void deleteEmp(Integer id){
        log.info("deleteEmp_"+id);
//        employeeMapper.deleteEmp(id);
    }


}
