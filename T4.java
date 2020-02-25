package com.java.se.T1;

import java.util.Arrays;
import java.util.Random;

public class T4 {
    public static void main(String[] args) {
        int ar[] = new int[20];
        Random r = new Random();
        int y = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = r.nextInt(20);
        }

        System.out.print(Arrays.toString(ar));
        System.out.println();

        for (int i = 0; i < ar.length; i++) {
            if (i % 2 !=0) {
                ar[i] = 0;

            }

            System.out.print(ar[i] + " ");
        }



    }
}
