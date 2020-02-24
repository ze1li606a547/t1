package com.java.se.go4;


import java.util.Random;
import java.util.Scanner;

public class Foggy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter your value: ");
        int n = scanner.nextInt();

        int mas[][] = new int[n][n];
               int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               mas[i][j] = random.nextInt(50);
            }
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println();
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
            if ((mas[i][n - 1 - i]) % 2 != 0) {             //сумма нечетных чисел дополнительной д
                sum += mas[i][n - 1 - i];
            }

        }
        System.out.println("summa= " + sum);*/
        //TASK v
        System.out.println("Transpodirovanie: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(mas[j][i]+" ");

            }System.out.println();

        }


    }
}











