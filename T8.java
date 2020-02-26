package com.java.se.T1;


import java.util.Random;

public class T8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];                     //я считаю в условии ошибка и сам изменил его ввожу числа от 1 до 9
        int y = 0;
        double[] c = new double[10];               //ибо 0 - это самоубийство
        Random r = new Random();
        System.out.println("Числа первого массива: ");
                for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(9)+1;

            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Числа второго массива: ");

        for (int i = 0; i < b.length; i++) {
            b[i] = r.nextInt(9)+1;
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("Числа третьего массива: ");
        for (int i = 0; i< c.length; i++){
            c[i] = (double) a[i]/b[i];
            System.out.print(c[i]+ " ");                // Here I need your help, как вывести целые числа? из массива 3

        }
        System.out.println();
        System.err.println("ХЗ как вывести целые числа, нид твоя хелп!");



    }
}
