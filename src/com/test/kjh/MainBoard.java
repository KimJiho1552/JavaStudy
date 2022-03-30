package com.test.kjh;

//Player 레벨에 따른 행동

class Player {
    private PlayerLevel level; //Player사 사지는 level 변수 선언

    public Player() { //디폴트 생성자
        level = new BeginnerLevel(); //처음 시작하면 BeginnerLevel로 시작
        level.showLevelMessage(); //레벨 메세지 출력
    }
    public PlayerLevel getLevel() { //PlayerLevel은 private이므로 getter로 전역변수 초기화
        return level;
    }
    public void upgradeLevel(PlayerLevel level) { //레벨을 변경할 수 있는 method
        this.level = level;
        level.showLevelMessage();
    }
    public void play(int count) {
        level.go(count); //PlayerLevel의 템플릿 method go() 호출
                         //Player가 go()를 호출하면 run, jump, turn method가 순서대로 호출
    }
}

//추상 클래스
abstract class PlayerLevel { //각 레벨에 따라 수행할 수 있는 기능이 달라짐
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int count) { //재정의되면 안 되므로 final로 선언
        run();
        for(int i = 0; i < count; i++) { //레벨에 따라 jump만 출력 횟수 증가
            jump();
        }
        turn();
    }
}

class BeginnerLevel extends PlayerLevel { //초급자 레벨
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }
    @Override
    public void jump() {
        System.out.println("Jump할 줄 모르지롱.");
    }
    @Override
    public void turn() {
        System.out.println("Turn할 줄 모르지롱.");        
    }
    @Override
    public void showLevelMessage() {
        System.out.println("***** 초보자 레벨입니다. *****");        
    }
}

class AdvancedLevel extends PlayerLevel { //중급자 레벨
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }
    @Override
    public void jump() {
        System.out.println("높이 Jump합니다.");
    }
    @Override
    public void turn() {
        System.out.println("Turn할 줄 모르지롱.");
    }
    @Override
    public void showLevelMessage() {
        System.out.println("***** 중급자 레벨입니다. *****");
    }
}

class SuperLevel extends PlayerLevel { //고급자 레벨
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }
    @Override
    public void jump() {
        System.out.println("아주 높이 Jump합니다.");
    }
    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다. *****");
    }
}

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player(); //처음 생성하면 BeginnerLevel로 시작
        player.play(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
