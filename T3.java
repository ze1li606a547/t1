package com.java.se.T1;

import java.util.Arrays;
import java.util.Random;

public class T3 {
    public static void main(String[] args) {
        int a[] = new int[15];
        Random r = new Random();

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(99);
                        if (a[i] % 2 == 0) {
                sum++;

            }
        }

        System.out.print(Arrays.toString(a));
        System.out.println();
        System.out.print("Summa: " + sum);

    }
}
