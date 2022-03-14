package com.startjava.Lesson2_3_4.game;

import java.util.Scanner;

import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void guess() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("randomNumber = " + randomNumber);
        Scanner console = new Scanner(System.in);

        player1.fillArray();
        player2.fillArray();

        player1.setAttempt(0);
        player2.setAttempt(0);

        System.out.println("У каждого игрока будет 10 попыток");

        while(player1.getAttempt() < 10) {
            player1.setAttempt(player1.getAttempt() + 1);
            player2.setAttempt(player2.getAttempt() + 1);

            if(tryGuessNumber(player1, randomNumber, console)) {
              break;
            }

            if (player1.getAttempt() == 10) {
                System.out.print("У игрока " + player1.getName() + " закончились попытки\n");
            }

           if (tryGuessNumber(player2, randomNumber, console)) {
              break;
           }

            if (player2.getAttempt() == 10) {
                System.out.print("У игрока " + player2.getName() + " закончились попытки\n");
            }
        }

        System.out.print("\nЧисла названные первым игроком - ");
        player1.printEnteredNumbers();

        System.out.print("\nЧисла названные вторым игроком - ");
        player2.printEnteredNumbers();
    }

    private boolean tryGuessNumber(Player player, int randomNumber, Scanner scan) {

        System.out.println("Введите число игрока " + player.getName() +  ":");
        player.addNumber(scan.nextInt());
        if(player.getLastNumber() > randomNumber) {
            System.out.println("Число введенное игроком " + player.getName() +  " больше того, что загадал компьютер");
            return false;
        } else if(player.getLastNumber() < randomNumber) {
            System.out.println("Число введенное игроком " + player.getName() +  " меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Число угадано игроком " + player.getName());
            return true;
        }
    }
}



