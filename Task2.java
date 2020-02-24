package com.java.se.Task2;

public class Task2 {
    public static void main(String[] args) {
        int n = 4;
        int m = 2;

        int mas[][] = new int[n][];
        int tmas[][] = new int[m][];

        for (int i = 0; i < tmas.length; i++)
            tmas[i] = new int[n];

        System.out.println("It's beginning: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new int[m];
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) Math.round(Math.random() * 50);
                System.out.print(mas[i][j] + " ");

            }
            System.out.println();
        }
        for (int i = 0; i < tmas.length; i++) {
            for (int j = 0; j < tmas[i].length; j++) {
                tmas[i][j] = mas[j][i];
            }
        }

        System.out.println("It's the end: ");

        for (int i = 0; i < tmas.length; i++) {
            for (int j = 0; j < tmas[i].length; j++) {
                System.out.print(tmas[i][j] + " ");
            }
            System.out.println();
        }


    }
}
