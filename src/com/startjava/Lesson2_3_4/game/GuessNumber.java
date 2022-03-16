package com.startjava.Lesson2_3_4.game;

import java.util.Scanner;

import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void guess() {
        init();

        Scanner console = new Scanner(System.in);

        System.out.println("У каждого игрока будет 10 попыток");

        while(player1.getAttempt() < 10) {
            player1.setAttempt(player1.getAttempt() + 1);
            player2.setAttempt(player2.getAttempt() + 1);

            if (tryGuessNumber(player1, console)) {
                break;
            }
            checkNumberOfAttempts (player1);

            if (tryGuessNumber(player2, console)) {
               break;
            }
            checkNumberOfAttempts (player2);
        }

        printEnteredNumbers(player1);

        printEnteredNumbers(player2);
    }

    private boolean tryGuessNumber(Player player, Scanner console) {
        System.out.println("Введите число игрока " + player.getName() +  ":");
        player.addNumber(console.nextInt());
        if(player.getLastNumber() > randomNumber) {
            System.out.println("Число введенное игроком " + player.getName() +  " больше того, что загадал компьютер");
        } else if(player.getLastNumber() < randomNumber) {
            System.out.println("Число введенное игроком " + player.getName() +  " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число угадано игроком " + player.getName());
            return true;
        }
        return false;
    }

    private void init() {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;

        player1.fillArray();
        player2.fillArray();

        player1.setAttempt(0);
        player2.setAttempt(0);
    }

    private void printEnteredNumbers (Player player) {
        System.out.print("\nЧисла названные игроком " + player.getName() + " - ");
        int[] enteredNumbers = player.getEnteredNumbers();
        for (int i = 0; i < enteredNumbers.length; i++) {
            System.out.print(" " + enteredNumbers[i]);
        }
    }

    private void checkNumberOfAttempts (Player player) {
        if (player.getAttempt() == 10) {
            System.out.print("У игрока " + player.getName() + " закончились попытки\n");
        }
    }
}



