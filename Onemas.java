package com.java.se.go7;

import java.util.Random;

public class Onemas {
    public static void main(String[] args) {

        int mas[] = {10, 11, 15, 18, 23, 21, 43, 73, 65};
        int  proiz =1;
        int sum =0;


        for (int i : mas) {
            if (i % 3 == 0){
                proiz*=i;
            }

        }
        System.out.println("Proizvedenie elements kratnoe 3: "+proiz);


    }

}