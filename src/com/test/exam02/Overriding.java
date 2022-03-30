package com.test.exam02;

abstract class SalesPlan { //추상 클래스
    public void companyGoal() { //일반 메소드
        System.out.println("2022년 전체 부서 300억 목표 달성!!!");
    }
    abstract public void departGoal(); //실행부가 없는 메소드
    abstract public void product();
}

class ATeam extends SalesPlan {
    public void manager() {
        System.out.println("A 팀 팀장 : ㅇㅇㅇ");
    }
    public void departGoal() { //Override
        System.out.println("A 팀 판매 목표 70억 달성!!!");
    }
    public void product() { //Override
        System.out.println("A 팀 주력 상품은 TV입니다.");
    }
}

class BTeam extends SalesPlan {
    public void manager() {
        System.out.println("B 팀 팀장 : ㅁㅁㅁ");
    }
    public void departGoal() { //Override
        System.out.println("B 팀 판매 목표 100억 달성!!!");
    }
    public void product() { //Override
        System.out.println("B 팀 주력 상품은 냉장고입니다.");
    }
}

public class Overriding {
    public static void main(String[] argv) {
        ATeam ATeamSalesPlan = new ATeam();
        ATeamSalesPlan.manager();
        ATeamSalesPlan.companyGoal();
        ATeamSalesPlan.departGoal();
        ATeamSalesPlan.product();
        System.out.println("");

        BTeam BTeamSalesPlan = new BTeam();
        BTeamSalesPlan.manager();
        BTeamSalesPlan.companyGoal();
        BTeamSalesPlan.departGoal();
        BTeamSalesPlan.product();
    }
}
