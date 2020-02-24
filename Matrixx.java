package com.java.se.go6;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Matrixx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter your value ");
        int n = sc.nextInt();
        int t = sc.nextInt();
//        int sum = 0;                // variable for task l and lV
//        int mltp = 1;              //variable for task lll
//        int mlpl2 = 1;             //variable for task lll
        int mas[][] = new int[n][t];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                mas[i][j] = r.nextInt(50);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        //TASK l

        /*for (int i=0;i<n;i++){
            if ((mas[i][i])%2==0){
                sum+=mas[i][i];
            }

        }
        System.out.println("Sum of even numbers of main diagonal= "+sum);*/

        //TASK ll

        /*for (int i = 1; i < n; i++) {
            for (int j = 0; j < t; j++) {
            }
            if ((mas[i][i - 1]) % 2 != 0)
            {
                System.out.println("Uneven numbers under main diagonal " + mas[i][i - 1]);
            }

        }*/


        //TASK lll
//


      /*  for (int i = 0; i < n; i++) {
            //for (int j = 0; j < t; j++) {
                mltp *= mas[i][i];
                mlpl2 *= mas[i][n - 1 - i];
            //}
        }
        if (mltp > mlpl2) {
            System.out.println("Main diagonal is greater!: " + mltp+ ">" +mlpl2);

        } else if (mltp < mlpl2) {
            System.out.println("Off diagonal is greater!: "+ mltp+ "<" + mlpl2);
        } else System.out.println("Both diagonals are equal!");*/

        //TASK lV


          //TASK V

    }
}
