package com.java.se.T1;

import java.util.Random;

public class T6 {
    public static void main(String[] args) {
        int array[] = new int[4];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean it = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                it = false;
            }
        }
        if (it) {
            System.out.println("Massive is upper!");
        } else {
            System.out.println("Massive is no upper!");
        }
    }
}
