package com.vn.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

/**
 * Posted from Nov 12, 2018, 10:22 AM
 *
 * @Author quynhntv (vi.quynh.31598@gmail.com)
 **/
public class Person  {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static List<Person> getPersonList(){
        List<Person> personLists = new ArrayList<Person>();
        personLists.add(new Person ("QuynhVi",25));
        personLists.add(new Person("ViQuynh",21));
        personLists.add(new Person ("QuynhVi",20));
        personLists.add(new Person("Quynh",21));
        return personLists;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

}
