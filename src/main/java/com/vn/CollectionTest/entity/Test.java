//package com.vnext.CollectionTest.entity;
//
///**
// * Posted from Nov 16, 2018, 4:04 PM
// *
// * @author Vi Quynh (vi.quynh.31598@gmail.com)
// */
//public class Test {
//    public static void main(String[] args) {
//        Student person = Person.findById(1);
//
//        // cách xử lý thông thường
//        //if (person != null) {
//        //   System.out.println(person.getName());
//        //}
//
//        // cách xử lý với Optional Class
//        // dùng ofNullable vì đối person có thể null
//        Optional<Person> optionalPerson = Optional.ofNullable(person);
//        // ifPresent: kiểm tra đối tượng bên trong optional có khác null không
//        optionalPerson.ifPresent(p -> System.out.println(p.getName()));
//    }
//}
