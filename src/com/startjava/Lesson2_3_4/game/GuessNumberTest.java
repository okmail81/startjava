package com.startjava.Lesson2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scan.nextLine());

        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scan.nextLine());

        System.out.println("У каждого игрока будет 10 попыток");

        String answer = "yes";
        
        while(answer.equals("yes")) {

            Arrays.fill(player1.getDroppedNumbers(), 0, player1.getUserAttempt(), 0);
            Arrays.fill(player2.getDroppedNumbers(), 0, player2.getUserAttempt(), 0);

            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.guess();
            do {
                System.out.println("\nХотите продолжать игру? [yes/no]:");
                answer = scan.nextLine();
            } while(!(answer.equals("yes") || answer.equals("no")));
        }
    }
}