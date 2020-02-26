package com.java.se.T1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Random r = new Random();
        int raz;
        int a = 0;
        int b = 0;
        do {
            System.out.print("Enter even number: ");
            n = sc.nextInt();
            if (n % 2 != 0) System.out.println("Wrong number! Try again.");
            if (n == 0) System.out.println("Wrong number! Try again.");         //!!!!Need help если вбивают 0 как
        } while (n % 2 != 0);                                                   //остановить программу, а то она выполняется


        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(15);
        }
        System.out.println(Arrays.toString(array));

        raz = array.length / 2;

        for (int i = 0; i < raz; i++) {
            a += array[i];
        }
        for (int i = raz - 1; i < array.length; i++) {
            b += array[i];
        }
        if (a > b)
            System.out.println("The sum of first part: " + a + " greater than second: " + b);
        else System.out.println("The sum of second part: " + b + " greater then second: " + a);

    }
}
