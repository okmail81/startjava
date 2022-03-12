package com.startjava.Lesson2_3_4.game;

public class Player {
    private String name;
    private int userAttempt;
    private int[] droppedNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setUserAttempt(int userAttempt) {
        this.userAttempt = userAttempt;
    }
    
    public int getUserAttempt() {
        return userAttempt;
    }

    public int[] getDroppedNumbers() {
        return droppedNumbers;
    }

    public void setDroppedNumbers(int Number, int userAttempt) {
        this.droppedNumbers[userAttempt-1] = Number;
    }
}