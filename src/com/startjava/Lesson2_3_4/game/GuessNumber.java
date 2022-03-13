package com.startjava.Lesson2_3_4.game;

import java.util.Arrays;
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

        Scanner scan = new Scanner(System.in);

        player1.setAttempt(1);
        player2.setAttempt(1);

        System.out.println("У каждого игрока будет 10 попыток");

        Arrays.fill(player1.getEnteredNumbers(), 0, player1.getAttempt(), 0);
        Arrays.fill(player2.getEnteredNumbers(), 0, player2.getAttempt(), 0);

        while(player1.getAttempt() <= 10) {
            tryGuessNumber(player1, randomNumber, scan);

            if (player1.getEnteredNumbers()[player1.getAttempt() - 1] == randomNumber) {
                break;
            }

            if (player1.getAttempt() == 10) {
                System.out.print("У игрока " + player1.getName() + " закончились попытки\n");
            }

            player1.setAttempt(player1.getAttempt() + 1);

            tryGuessNumber(player2, randomNumber, scan);

            if (player2.getEnteredNumbers()[player2.getAttempt() - 1] == randomNumber) {
                break;
            }

            if (player2.getAttempt() == 10) {
                System.out.print("У игрока " + player2.getName() + " закончились попытки\n");
            }

            player2.setAttempt(player2.getAttempt() + 1);
        }

        System.out.print("\nЧисла названные первым игроком - ");
        printArray(player1);

        System.out.print("\nЧисла названные вторым игроком - ");
        printArray(player2);
    }

    private void tryGuessNumber(Player player, int randomNumber, Scanner scan) {
        String insert1 = "";
        String insert2 = "";

        switch (player.getNumberPlayer()) {
            case 1:
                insert1 = "первого";
                insert2 = "первым";
                break;
            case 2:
                insert1 = "второго";
                insert2 = "вторым";
                break;
            case 3:
                insert1 = "третьего";
                insert2 = "третьим";
        }
        System.out.println("Введите число " + insert1 +  " игрока:");
        player.setAttempt(player.getAttempt());
        player.addNumber(scan.nextInt());
        if(player.getLastNumber() > randomNumber) {
            System.out.println("Число введенное " + insert2 +  " игроком больше того, что загадал компьютер");
        } else if(player.getLastNumber() < randomNumber) {
            System.out.println("Число введенное " + insert2 +  " игроком меньше того, что загадал компьютер");
        } else {
            System.out.println("Число угадано " + insert2 +  " игроком! - " + player.getName());
        }
    }

    private void printArray(Player player) {
        for (int numbers : Arrays.copyOf(player.getEnteredNumbers(), player.getAttempt())) {
            System.out.print(numbers + " ");
        }
    }
}



