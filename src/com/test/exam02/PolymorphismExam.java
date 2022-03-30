package com.test.exam02;

class Family {
    void hello() {
        System.out.println("인사합시다.");
    }
}

class kimFamily extends Family{
    void hello() { System.out.println("김선생님 안녕하세요."); }
    void dinner() { System.out.println("식사 한 번 하시죠."); }
    void drink() { System.out.println("술 한 잔 하죠."); }
}

class parkFamily extends Family{
    void hello() { System.out.println("박선생님 안녕하세요."); }
    void fishing() { System.out.println("낚시나 같이 하시죠."); }
}

public class PolymorphismExam {
    public static void main(String[] args) {
        Family family = new Family();
        family.hello();

        Family kimf = new kimFamily();
        kimf.hello();

        Family parkf = new parkFamily();
        parkf.hello();
    }
}
