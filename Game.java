package com.java.se.TicTac;

public class Game {
    public static void main(String[] args) {
        Board myGame = new Board();
        int count = 1;
        myGame.display();
        while (myGame.act() && count<10) {
            if (count % 2 == 0){
                myGame.markPlayer('O');
            }else{
                myGame.markPlayer('+');
            }
            count++;
            System.out.println();
            myGame.display();
            myGame.winner();
        }
        if (count == 10){
            System.out.println("D R A W !!!");
        }
    }
}
