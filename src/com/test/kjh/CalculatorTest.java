package com.test.kjh;

import java.io.IOException;

interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}

abstract class Calculator implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }
    @Override
    public int divide(int num1, int num2) {
        if(num2 != 0)
            return num1 / num2;
        else
            return Calc.ERROR;
    }
}
/*
class CompleteCalc extends Calculator {
    
    
    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
*/
public class CalculatorTest {
    public static void main(String[] args) throws IOException {
        
        Calculator calc = null;

        while(true) {
            System.out.println("두 수를 입력하시오.");
            int num1 = System.in.read();
            int num2 = System.in.read();
        
            System.out.println("연산자를 선택하시오(+ - * / @)");
            int func = System.in.read();

            System.out.print(num1 + num2 + func);

            if(func == '+')
                System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
            else if(func == '-')
                System.out.println(num1 + " - " + num2 + " = " + calc.substract(num1, num2));
            else if(func == '*')
                System.out.println(num1 + " * " + num2 + " = " + calc.times(num1, num2));
            else if(func == '/')
                System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
            else if(func == '@')
                break;
            else
                System.out.println("ERROR");
        }
        //calc.showInfo();
    }
}
