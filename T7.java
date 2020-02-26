package com.java.se.T1;

import java.util.Random;

public class T7 {
    public static void main(String[] args) {
        int[]array = new int[12];
        int max = -1;             // если у нас минимальное число 0, то я брал число меньше начего минимального
        int mi = 0;               // ьаксимальный индекс присвоил ему 0
        Random r = new Random();
        for (int i =0; i<array.length; i++){
            array[i]= r.nextInt(15);
            System.out.print(array[i]+" ");
            if (max<=array[i]){
                max = array[i];
                mi =i;
            }
        }
        System.out.println();
        System.out.println("Index of MAX massive: "+ mi);

    }
}
