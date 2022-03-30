package com.test.exam02;

class A {
    public void a() {
        System.out.println("파라미터가 없음");
    }
    public void a(int i, int j) { //overloading : 변수는 같지만 매개변수가 다르므로 가능
        System.out.println("파라미터가 있음" + i + " " + j);
    }
}

public class OverloadingExam {
    public static void main(String[] args) {
        A a = new A();
        a.a();
        a.a(1, 2);
    }
}
