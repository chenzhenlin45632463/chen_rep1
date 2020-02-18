package head.com.demo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import head.com.model.Person;

public class SpringIocMainTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) applicationContext.getBean("yooPerson");

        System.out.println(person);
    }
}
