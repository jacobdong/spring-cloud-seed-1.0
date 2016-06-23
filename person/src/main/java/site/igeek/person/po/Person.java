package site.igeek.person.po;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

/**
 * Created by jacobdong on 16/6/23.
 */
@Entity
public class Person {

    @Id
    private String id;
    private String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
