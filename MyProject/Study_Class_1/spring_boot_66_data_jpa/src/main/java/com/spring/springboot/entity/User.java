package com.spring.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//使用JPA注解来配置映射关系
@Entity//告诉Jpa这是一个实体类（和数据库表映射）
@Table(name="jpa_user")//name用来指定和那个表对应，默认表名为类名小写user
@Getter
@Setter
public class User {

    @Id//表示这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键自增
    private Integer id;

    @Column(name = "last_name")//这是和数据库表对应的一个列
    private String lastName;

    @Column//省略类属性名为默认列名
    private String email;
}
