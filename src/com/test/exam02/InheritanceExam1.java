package com.test.exam02;

class Parents {
    //생성자는 클래스의 전역변수(멤버변수)를 초기화시킨다.
    //생성자는 클래스의 인스턴스가 생성될 때 가장 먼저 실행되어 생성자 내에 기술된 명령문을 실행한다.
    //this.전역변수 , super.전역변수
    //this, super --> 지시어, 명령어, 예약어, 키워드
    Parents() {
        this(1); //자신의 인자 1개를 받는 생성자 호출
        //this(1, "A");
        System.out.println("인자가 없는 Parents 클래스의 생성자");
    }

    Parents(int i) {
        System.out.println("인자가 1개인 Parents 클래스의 생성자");
    }
    
    //Parents(int i, String str) {
    //    System.out.println("인자가 2개인 Parents 클래스의 생성자");
    //}
}

class Child extends Parents {
    int c1;
    int c2;

    Child() {
        super(); //부모 클래스의 생성자를 호출
        //super(1); //인자가 1개인 부모 클래스의 생성자 호출
        System.out.println("인자가 없는 Child 클래스의 생성자");
    }

    Child(int c1, int c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
}
//this, super가 없을 경우 : 상속 클래스의 생성자를 실행하기 전에
//                         자동으로 부모 클래스의 생성자를 호출

public class InheritanceExam1 {
    public static void main(String[] args) {
        Child child = new Child(1, 2); //Child 클래스의 인스턴스 생성
        System.out.println("Child Class의 전역변수 : " + child.c1 + " " + child.c2);
    }
}
