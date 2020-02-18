package com.spring.high.springboot.conf;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//springSecurity的配置类
@EnableWebSecurity
public class MySecurityConf extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
//        定制请求的授权规则
        http.authorizeRequests().antMatchers("/").permitAll()// "/" 路径下任何人都可以访问
                .antMatchers("/level1/**").hasRole("VIP1")
                .antMatchers("/level2/**").hasRole("VIP2")
                .antMatchers("/level3/**").hasRole("VIP3");
        //开启自动配置的登录功能，效果：如果没有登陆，没有权限，就会自动来到登录页面
        http.formLogin();
//        1、/login来到登录页
//        2、重定向到/login?error表示登录失败
//        3、更多详细规定

        //开启自动配置的注销功能
        http.logout().logoutSuccessUrl("/");//注销成功后来到首页
        //1、访问/logout表示用户注销，清空session
        //2、注销成功后会回到“/login?logout”页面
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
        //inMemoryAuthentication 从内存中获取
        /**
         * 出现了There is no PasswordEncoder mapped for the id "null"异常
         * 上网查找后
         * https://blog.csdn.net/canon_in_d_major/article/details/79675033
         * 改错后的示例代码
         * auth.inMemoryAuthentication()
         *                 .passwordEncoder(new BCryptPasswordEncoder())
         *                 .withUser("user1").password(new BCryptPasswordEncoder().encode("123456")).roles("USER");
         */

        auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("chenwei").password(new BCryptPasswordEncoder().encode("chenweitx")).roles("VIP1","VIP2")

                .and()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("root").password(new BCryptPasswordEncoder().encode("rootpd")).roles("VIP2","VIP3")

                .and()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("admin").password(new BCryptPasswordEncoder().encode("adminpd")).roles("VIP1","VIP2","VIP3");
    }
}
