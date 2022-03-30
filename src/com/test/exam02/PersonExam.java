package com.test.exam02;

public class PersonExam {
    public static void main(String[] args) {
        //기본
        /*
        Person person = new Person();
        System.out.println(person.age);

        person.age = 50;
        System.out.println(person.age);
        person.smaile();

        Person person1 = new Person();
        System.out.println(person1.age); //person.age의 50 영향 안받음 -> 캡슐화
        */

        //기본 생성자
        /*
        Person person = new Person("김철수");
        System.out.println(person.name);

        Person p1 = new Person(21, "male");
        System.out.println(p1.age + " " + p1.gender);
        */

        //getter, setter 사용
        Person person = new Person();
        String name = "김철수";
        int age = 45;
        String gender = "male";

        person.setName(name);
        System.out.println(person.getName());
        person.setAge(age);
        System.out.println(person.getAge());
        person.setGender(gender);
        System.out.println(person.getGender());
    }
}
