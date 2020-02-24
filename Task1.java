package com.java.se.Task1;

public class Task1 {
    public static void main(String[] args) {


        int mas[][] = new int[3][];
        int tmas[][] = new int[3][];
        System.out.println("Выодим нашу матрицу: ");

        for (int i = 0; i < mas.length; i++) {
            mas[i] = new int[3];
            tmas[i] = new int[3];
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = (int) Math.round(Math.random() * 50);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                tmas[i][j] = mas[j][i];
            }
        }
        System.out.println("Здесь наша транспонировка: ");

        for (int i = 0; i < tmas.length; i++) {
            for (int j = 0; j < tmas.length; j++) {
                System.out.print(tmas[i][j] + " ");
            }
            System.out.println();
        }

    }
}
