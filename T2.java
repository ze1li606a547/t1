package com.java.se.T1;


import java.util.Arrays;

public class T2 {
    public static void main(String[] args) {
        int [] array = new int[99];
        int b=0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
               array[b] = i;
                System.out.print(array[b] + " ");
                b++;

            }
        }
        System.out.println();
        for (int i = 99; i>0; i--){
            if (i%2==1){
                array[b]=i;
                System.out.print(array[b] + " ");
                b--;
            }
        }

    }
}