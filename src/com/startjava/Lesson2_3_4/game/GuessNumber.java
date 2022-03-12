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

        int userAttempt = 1;

        while(userAttempt <= 10) {

            tryGuessNumber(player1, 1, userAttempt, randomNumber, scan);

            if (player1.getDroppedNumbers()[userAttempt-1] == randomNumber) {
                break;
            }

            tryGuessNumber(player2, 2, userAttempt, randomNumber, scan);

            if (player2.getDroppedNumbers()[userAttempt-1] == randomNumber) {
                break;
            }
            userAttempt++;
        }

        System.out.print("\nЧисла названные первым игроком - ");
        for (int numbers : Arrays.copyOf(player1.getDroppedNumbers(), userAttempt)) {
          System.out.print(numbers + " ");
        }

        System.out.print("\nЧисла названные вторым игроком - ");
        for (int numbers : Arrays.copyOf(player2.getDroppedNumbers(), userAttempt)) {
            System.out.print(numbers + " ");
        }
    }

    private void tryGuessNumber(Player player, int numberPlayer, int userAttempt, int randomNumber, Scanner scan) {
        String insert1 = "";
        String insert2 = "";

        switch (numberPlayer) {
            case 1:
                insert1 = "первого";
                insert2 = "первым";
                break;
            case 2:
                insert1 = "второго";
                insert2 = "вторым";
        }
        System.out.println("Введите число " + insert1 +  " игрока:");
        player.setUserAttempt(userAttempt);
        player.setDroppedNumbers(scan.nextInt(), userAttempt);
        if(player.getDroppedNumbers()[userAttempt-1] > randomNumber) {
            System.out.println("Число введенное " + insert2 +  " игроком больше того, что загадал компьютер");
        } else if(player.getDroppedNumbers()[userAttempt-1] < randomNumber) {
            System.out.println("Число введенное " + insert2 +  " игроком меньше того, что загадал компьютер");
        } else {
            System.out.println("Число угадано " + insert2 +  " игроком! - " + player.getName());
        }
    }

}



