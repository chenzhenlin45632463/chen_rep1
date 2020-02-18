package head.com.demo01;

import head.com.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ObjectEqualsDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("纪晓岚", 38);
        Person p3 = new Person("纪晓岚", 38);
        List list = new ArrayList();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
//        System.out.println(p1.equals(p2));
        System.out.println(p3.equals(p2));
        System.out.println(p3.equals(null));
//        System.out.println(p1 == p2);
//        System.out.println(p3 == p2);
    }
}
