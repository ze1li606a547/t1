package com.java.se.Computer;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private boolean start = true;
    private String cpu = "AMD 4500fx";
    private String ozy = "32 Gb";
    private String hdd = "Samsung kakoita";
    private int resource = 2;
    int numII, numUz;
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    public void display() {
        System.out.println(cpu + ", " + ozy + ", " + hdd + ", " + "Limit ON/OFF: " + resource);
    }

    public boolean act() {
        return start;
    }

    public void turningOn() {
        numII = r.nextInt(2);
        if (numII == 2) {
            System.out.println("Компьтер работает без сбоев");
        }
        if (numII != 2) {
            System.out.print("0 or 1: ");
            numUz = sc.nextInt();
            if (numII == numUz) {
                System.out.println("Компьютер выключился");
                resource--;
            } else {
                System.out.println("Компьтер сгорел!");
                System.exit(0);
            }
        }
    }
    public void shutdown() {
        numII = r.nextInt(1);
              System.out.print("0 or 1: ");
        numUz = sc.nextInt();
        if (numII == numUz) {
            System.out.println("Компьютер выключился");
            resource--;
        } else {
            System.out.println("Компьтер сгорел!");
            System.exit(0);
        }
    }
    public void limited(){
        if (resource == 0){
            System.err.println("Компьтер сгорел!");
        start = false;}
    }
}



