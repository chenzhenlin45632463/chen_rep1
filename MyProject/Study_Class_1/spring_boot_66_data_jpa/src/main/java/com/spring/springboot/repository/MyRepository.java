package com.spring.springboot.repository;

import com.spring.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<U,E>U泛型为实体类类型,E泛型为E类的主键id的类型
public interface MyRepository extends JpaRepository<User,Integer> {
}
