package com.startjava.Lesson2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scan.nextLine());
        
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scan.nextLine());
        
        String answer = "yes";
        
        while(answer.equals("yes")) {
            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.guess();
            do {
                System.out.println("Хотите продолжать игру? [yes/no]:");
                answer = scan.nextLine();
            } while(!(answer.equals("yes") || answer.equals("no")));
        }
    }
}