package com.startjava.Lesson2_3_4.animal;

public class Wolf {
    private char sex;
    private String nickname;
    private float weight;
    private int age;
    private String color;
    
    public char getSex() {
        return sex;
    }
    
    public void setSex(char sex) {
        this.sex = sex;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public float getWeight() {
        return weight;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 8 ) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void move() {
        System.out.println("Волк идет");
    }
    
    public void howl() {
        System.out.println("Волк воет");
    }
    
    public void run() {
        System.out.println("Волк бежит");
    }
    
    public void sit() {
        System.out.println("Волк сидит");
    }
    
    public void hunt() {
        System.out.println("Волк охотится");
    }
}