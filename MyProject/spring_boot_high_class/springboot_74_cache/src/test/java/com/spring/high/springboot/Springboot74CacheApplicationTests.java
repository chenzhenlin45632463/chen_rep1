package com.spring.high.springboot;

import com.spring.high.springboot.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot74CacheApplicationTests {

    @Resource//代替@Autowired，不会报红线
//    @Autowired
    private EmployeeMapper employeeMapper;

    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Resource
    RedisTemplate redisTemplate;


    @Test
    public void testRedis(){
//        stringRedisTemplate.opsForValue().append("name","剑南春");
        String name = stringRedisTemplate.opsForValue().get("name");
        System.out.println("redis :"+name);
    }


    @Test
    public void contextLoads() {

        System.out.println(employeeMapper.getEmpById(1));
    }

}
