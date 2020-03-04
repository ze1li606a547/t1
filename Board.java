package com.java.se.TicTac;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    private char[][] board;
    private boolean gameStart = true;
    public Board() {
        board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], ' ');
        }
    }
    public void display() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("\t" + board[i][j]);
                if (j == 0 || j == 1) {
                    System.out.print("|");
                }
            }
            if (i == 0 || i == 1) {
                System.out.println();
                System.out.println("---------------");
            }
        }
        System.out.println();
    }
    public boolean turn(char player, int i, int j) {
        if (i >= 0 && i <= 2 && j >= 0 && j <= 2) {
            if (board[i][j] != ' ')
                return false;
            else {
                board[i][j] = player;
                return true;
            }
        }
        return false;
    }
    public boolean act() {
        return gameStart;
    }
    public boolean winner() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                    gameStart = false;
                    System.out.println("Player " + board[i][0] + " wins!");
                }
                if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                    gameStart = false;
                    System.out.println("Player " + board[0][j] + " wins!");
                }
                if (board[0][0] == board[1][1] && board[2][2] == board[1][1] && board[0][0] != ' ') {
                    gameStart = false;
                    System.out.println("Player " + board[0][0] + " wins!");
                }
                if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
                    gameStart = false;
                    System.out.println("PLAYER " + board[0][2] + " W I N S !!!");
                }
            }
        }
        return true;
    }
    public void markPlayer(char player) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        do {
            System.out.printf("Now player %s is turn, enter i(0 - 2): ", player);
            i = sc.nextInt();
            System.out.printf("Now player %s is turn, enter j(0 - 2): ", player);
            j = sc.nextInt();
        } while (wrongValue(i, j));
        turn(player, i, j);
    }
    public boolean wrongValue(int i, int j) {
        if (i > 2 || i < 0 || j > 2 || j < 0 || !check(i, j)) {
            return true;
        }
        return false;
    }
    public boolean check(int i, int j) {
        if (board[i][j] == ' ') {
            return true;
        } else {
            System.out.println("That's taken!");
            return false;
        }
    }
}





//https://www.codeflow.site/ru/article/java-printstream-printf
//http://www.kopilka77.ru/docs/gsv/disciplini/java/lections/lection%207.pdf