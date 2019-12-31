package com.vnext.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Posted from Nov 12, 2018, 9:44 AM
 *
 * @Author quynhntv (vi.quynh.31598@gmail.com)
 **/

//(argtype arg...) -> { return some expression.. probably using these arguments }
public class LambdaTest {
    public static void main(String[] args) {
        List<Person> listPersonSortByName = Person.getPersonList();

        listPersonSortByName.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("sort by name:");
        for (Person person: listPersonSortByName) {
            System.out.println(person);
        }

        List<Person> listPersonSortByNameAndAge = Person. getPersonList();
        listPersonSortByNameAndAge.sort((o1, o2) -> {
            if (o1.getName().equals(o2.getName())) {
                return o2.getAge() - o1.getAge();
            }
            return o1.getName().compareTo(o2.getName());
        });
        System.out.println();
        System.out.println("sort by name and age:");
        for (Person person: listPersonSortByNameAndAge) {
            System.out.println(person);
        }
        //compare version cu
        Comparator<Person> compByName = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        //compare su dung lambda
        Comparator<Person> compByName1 = (Person o3, Person o4) -> o3.getName().compareTo(o4.getName());
        // hoặc
        Comparator<Person> compByName2 = (o1, o2) -> o1.getName().compareTo(o2.getName());

        // Một danh sách các loại quả.
        List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Cherry");

        // Sử dụng phương thức tiện ích của Collections
        // để sắp xếp lại danh sách trên.
        // Cung cấp một Comparator (Bộ so sách).
        Collections.sort(fruits, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        });

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
