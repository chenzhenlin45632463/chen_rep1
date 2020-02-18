package head.com.model;


import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person){//将对象进行类型比对
            //getClass()==obj.getClass();//等效于obj instanceof Person，利用反射技术查看是否同类型
            Person person = (Person)obj;//将obj向下转换为Person，获得Person属性进行对比
            if (this.age.equals(person.age)&&this.name.equals(person.name)){
                return true;
            }
        }
        return false;
    }
}
