package com.test.thread;

class ExamClass2 extends Thread {
    @Override
    public void run() {
        try {
            for(int i = 0; i < 30; i++) {
                Thread.sleep(1000);
                System.out.println("Thread1이 실행");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadExam2 {
    public static void main(String[] args) {
        ExamClass2 examClass2 = new ExamClass2();
        examClass2.start();
        for(int i = 0; i < 30; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread2가 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }   
        }
    }
}
//단점 : 상수로 받은 것을 사용하기 때문에 다중 상속 안됨(인터페이스는 됨)
//Thread1 실행이 끝나고 Thread2가 실행되어야 하지만 비동기 처리을 하기 때문에
//지 멋대로 순서가 섞임