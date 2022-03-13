package com.startjava.Lesson2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scan.nextLine(), 1);

        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scan.nextLine(), 2);

        String answer = "yes";
        
        while(answer.equals("yes")) {

            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.guess();
            do {
                System.out.println("\nХотите продолжать игру? [yes/no]:");
                answer = scan.nextLine();
            } while(!(answer.equals("yes") || answer.equals("no")));
        }
    }
}