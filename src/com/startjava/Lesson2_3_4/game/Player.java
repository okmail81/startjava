package com.startjava.Lesson2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
    
    public int getAttempt() {
        return attempt;
    }

    public void printEnteredNumbers() {
        for(int i = 0; i < attempt; i++) {
            System.out.print(enteredNumbers[i] + " ");
        }
    }

    public void addNumber(int number) {
        this.enteredNumbers[attempt - 1] = number;
    }

    public int getLastNumber() {
        return enteredNumbers[attempt - 1];
    }

    public void fillArray() {
        Arrays.fill(enteredNumbers, 0, attempt, 0);
    }
}