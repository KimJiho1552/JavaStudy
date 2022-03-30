package com.test.kjh;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6}; //배열

        //1
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");

        //2
        for(int i : a) System.out.print(i + " "); //배열 전용
        System.out.println("\n");

        //3
        System.out.print(Arrays.toString(a));
        System.out.println("\n");

        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; //이차원 배열

        //1
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
        }
        System.out.println("\n");

        //2
        for(int i = 0; i < b.length; i++) {
            System.out.print(Arrays.toString(b[i]));
        }
        System.out.println("\n");
    }
}
