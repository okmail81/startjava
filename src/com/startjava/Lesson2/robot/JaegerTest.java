package com.startjava.Lesson2.robot;

public class JaegerTest {
    public static void main(String[] args) {
        //Jaeger jaeger1 = new Jaeger();
        //jaeger1.setModelName("Tacit Ronin");
        //jaeger1.setMark("Mark-1");
        //jaeger1.setOrigin("Japan");
        //jaeger1.setHeight(244f);
        //jaeger1.setWeight(7450f);
        //jaeger1.setSpeed(8);
        //jaeger1.setStrenght(7);
        //jaeger1.setArmor(3);
        
        //Jaeger jaeger2 = new Jaeger();
        //jaeger2.setModelName("Coyote Tango");
        //jaeger2.setMark("Mark-1");
        //jaeger2.setOrigin("Japan");
        //jaeger2.setHeight(280f);
        //jaeger2.setWeight(2312f);
        //jaeger2.setSpeed(5);
        //jaeger2.setStrenght(7);
        //jaeger2.setArmor(3);
        
        Jaeger jaeger1 = new Jaeger("Tacit Ronin", "Mark-1", "Japan", 244f, 7450f, 8, 7, 3);
        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", "Japan", 280f, 2312f, 5, 7, 3);
        
        System.out.println("Имя первого егеря - " + jaeger1.getModelName());
        System.out.println("Имя второго егеря - " + jaeger2.getModelName());
        
        String mark1 = jaeger1.getMark();
        String mark2 = jaeger2.getMark();
        System.out.println("Серия первого егеря - " + mark1);
        System.out.println("Серия второго егеря - " + mark2);
        if(mark1.equals(mark2)) {
            System.out.println("Серии егерей равны");
        } else {
            System.out.println("Серии егерей различны");
        }
        
        String origin1 = jaeger1.getOrigin();
        String origin2 = jaeger2.getOrigin();
        System.out.println("Страна производитель первого егеря - " + origin1);
        System.out.println("Страна производитель второго егеря - " + origin2);
        if(origin1.equals(origin2)) {
            System.out.println("Егеря произведены в одной стране");
        } else {
            System.out.println("Егеря произведены в различных странах");
        }
        
        float height1 = jaeger1.getHeight();
        float height2 = jaeger2.getHeight();
        System.out.println("Рост первого егеря - " + height1);
        System.out.println("Рост второго егеря - " + height2);
        if(height1 == height2) {
            System.out.println("Рост егерей одинаков");
        } else {
            System.out.println("Рост егерей различный");
        }
        
        float weight1 = jaeger1.getWeight();
        float weight2 = jaeger2.getWeight();
        System.out.println("Вес первого егеря - " + weight1);
        System.out.println("Вес второго егеря - " + weight2);
        if(weight1 == weight2) {
            System.out.println("Вес егерей одинаков");
        } else {
            System.out.println("Вес егерей различный");
        }
        
        int speed1 = jaeger1.getSpeed();
        int speed2 = jaeger2.getSpeed();
        System.out.println("Скорость первого егеря - " + speed1);
        System.out.println("Скорость второго егеря - " + speed2);
        if(speed1 == speed2) {
            System.out.println("Скорость егерей одинакова");
        } else {
            System.out.println("Скорость егерей различна");
        }
        
        int strenght1 = jaeger1.getStrenght();
        int strenght2 = jaeger2.getStrenght();
        System.out.println("Сила первого егеря - " + strenght1);
        System.out.println("Сила второго егеря - " + strenght2);
        if(strenght1 == strenght2) {
            System.out.println("Сила егерей одинакова");
        } else {
            System.out.println("Сила егерей различна");
        }
        
        int armor1 = jaeger1.getArmor();
        int armor2 = jaeger2.getArmor();
        System.out.println("Броня первого егеря - " + armor1);
        System.out.println("Броня второго егеря - " + armor2);
        if(armor1 == armor2) {
            System.out.println("Броня егерей одинакова");
        } else {
            System.out.println("Броня егерей различна");
        }
        
        jaeger2.setArmor(4);
        armor1 = jaeger1.getArmor();
        armor2 = jaeger2.getArmor();
        System.out.println("\nБроня первого егеря - " + armor1);
        System.out.println("Броня второго егеря - " + armor2);
        if(armor1 == armor2) {
            System.out.println("Броня егерей одинакова\n");
        } else {
            System.out.println("Броня егерей различна\n");
        }
        
        jaeger1.move();
        jaeger2.move();
        
        jaeger1.useVortexCannon();
        jaeger2.useVortexCannon();
    }
}