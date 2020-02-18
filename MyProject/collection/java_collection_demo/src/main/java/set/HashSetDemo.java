package set;

import com.model.Animal;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        Animal a = new Animal("长颈鹿");
        Animal b = new Animal("长颈鹿");
        set.add(a);
        set.add(a);
        set.add(b);
        set.add(b);
        set.add("adc");
        set.add("apc");
        set.add(1098);
        System.out.println(set);
        System.out.println(set.size());
    }
}
