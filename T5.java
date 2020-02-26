package com.java.se.T1;

import java.util.Random;

public class T5 {
    public static void main(String[] args) {
        int array1[] = new int[15];
        int array2[] = new int[15];
        double sum1=0;
        double avg1 = 0;
        double sum2=0;
        double avg2 =0;

        Random r = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(15);
            System.out.print(array1[i] + " ");
            sum1+=array1[i];

        }
        System.out.println();
        System.out.print("Summa of first massive: "+ sum1);
        avg1 = sum1/array1.length;
        System.out.println();
        System.out.println(avg1);
        for (int i=0; i<array2.length; i++){
            array2[i] = r.nextInt(15);

            System.out.print(array2[i]+" ");
            sum2+=array2[i];

        }
        System.out.println();
        System.out.print("Summa of second massive: "+sum2);
        avg2 = sum2/array2.length;
        System.out.println();
        System.out.println(avg2);

        if (avg1>avg2) {
            System.out.println("First Value Greater!");
        }
        else if (avg1<avg2){
            System.out.println("Second Value Greater!");

        }
        else System.out.println("Both Values are Equals!");



    }


}

