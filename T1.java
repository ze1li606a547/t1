package com.java.se.T1;

public class T1 {
    public static void main(String[] args) {
        int b = 0;
        int[] Mas = new int[20/2];
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                Mas[b] = i;
                System.out.print(Mas[b] + " ");
                b++;
            }
        }
        System.out.println();
        System.out.println("Выведем на экран каждый элемент массива на отдельной строке: ");

        for (int i = 0; i < Mas.length; i++) {

            System.out.println(Mas[i]);
        }
    }
}



