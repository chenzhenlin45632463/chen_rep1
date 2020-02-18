package com.springboot.spring_boot30.config;
import com.springboot.spring_boot30.component.LoginHandlerInterceptor;
import com.springboot.spring_boot30.component.MyLocalResolver;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcSelfConfig {

    @Bean //一定要将这个定制器加入到容器中
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer() {

            //定制嵌入式的Servlet容器相关的规则
            @Override
            public void customize(WebServerFactory factory) {
                //TODO factory是接口，继承他的类没有适合的；
            }
        };
    }

    //使用WebMvcConfigurer可以扩展springMVC的功能
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){

        WebMvcConfigurer adapter = new WebMvcConfigurer() {
            //视图解析器的配置
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                //防止表单重复提交当中
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            //配置拦截器，登录校验
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                super.addInterceptors(registry);
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")//拦截的资源
//                        .excludePathPatterns("/index.html","/","/user/login","/asserts/**");//放行的资源
            }
        };
        return adapter;
    }

    /***
     * local区域校验，(国际化：中英文切换)
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }
}
