package com.test.exam02;

public class Person {
    //String name; //생성자 이용할 때
    //int age;
    //String gender;

    private String name; //getter/setter 이용할 때
    private int age;
    private String gender;

    public Person(){} //기본 생성자(자동/수동 둘 다 가능)

    //전역변수 초기화//

    //생성자 이용
    public Person(String name, int age, String gender) {
        this.name = name; //this는 전역변수를 가리킴
        this.age = age;
        this.gender = gender;
    }

    //private일 때 -> getter method
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    //private일 때(값을 넣을 때) -> setter method
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void smaile() {
        System.out.println("웃어요.");
    }
    public void anger() {
        System.out.println("화 내지 마세요.");
    }
}
