package com.startjava.Lesson2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.setSex('m');
        myWolf.setNickname("Феликс");
        myWolf.setWeight(45f);
        myWolf.setAge(9);
        myWolf.setColor("cерый");
        
        System.out.println("Пол волка - " + myWolf.getSex());
        System.out.println("Кличка волка - " + myWolf.getNickname());
        System.out.println("Вес волка - " + myWolf.getWeight());
        System.out.println("Возраст волка - " + myWolf.getAge());
        System.out.println("Окрас волка - " + myWolf.getColor() + "\n");
        
        myWolf.move();
        myWolf.howl();
        myWolf.run();
        myWolf.sit();
        myWolf.hunt();
    }
}