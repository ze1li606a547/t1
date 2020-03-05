package com.java.se.Computer;

public class Engine {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.display();
        int count = 1;

        while (comp.act() && count < 20) {
            if (count % 2 != 0) {
                comp.turningOn();
            } else {
                comp.shutdown();
            }
            count++;
            System.out.println();
            comp.display();
            comp.limited();
        }
    }
}
