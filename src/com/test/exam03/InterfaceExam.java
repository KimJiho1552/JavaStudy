package com.test.exam03;

interface Sales { //메소드만 정의 --> 실행부 없음
    public void manager();
    public void goal();
    public void product();
}

class ATeam implements Sales { //interface는 상속 받을 때 implements 사용
    @Override
    public void manager() {
        System.out.println("A 팀장입니다. 열심히 하겠습니다.");
    }
    @Override
    public void goal() {
        System.out.println("A 팀은 올해 70억을 달성해보겠습니다.");
    }
    @Override
    public void product() {
        System.out.println("A 팀은 TV를 판매하겠습니다.");
    }
}

class BTeam implements Sales {
    @Override
    public void manager() {
        System.out.println("B 팀장입니다.");
    }
    @Override
    public void goal() {
        System.out.println("B 팀은 올해 100억을 달성해보겠습니다.");
    }
    @Override
    public void product() {
        System.out.println("B 팀은 냉장고를 판매하겠습니다.");
    }
}

public class InterfaceExam {
    public static void main(String[] args) {
        ATeam aSalePlan = new ATeam();
        aSalePlan.manager();
        aSalePlan.goal();
        aSalePlan.product();

        BTeam bSalePlan = new BTeam();
        bSalePlan.manager();
        bSalePlan.goal();
        bSalePlan.product();
    }
}
