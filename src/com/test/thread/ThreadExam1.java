package com.test.thread;

class ExamClass1 implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); //1초간 지연
                System.out.println("Thread2가 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExam1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new ExamClass1());
        thread.start();

        for(int i = 0; i < 10; i++) { //비동기로 돌아가는지 확인
            try {
                Thread.sleep(1000);
                System.out.println("Thread1이 실행");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
