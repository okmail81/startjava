public class WolfTest {
    public static void main(String[] args) {
        
        Wolf myWolf = new Wolf();
        myWolf.sex = 'm';
        myWolf.nickname = "Феликс";
        myWolf.weight = 45f;
        myWolf.age = 5;
        myWolf.color = "cерый";
        
        System.out.println("Пол волка - " + myWolf.sex);
        System.out.println("Кличка волка - " + myWolf.nickname);
        System.out.println("Вес волка - " + myWolf.weight);
        System.out.println("Возраст волка - " + myWolf.age);
        System.out.println("Окрас волка - " + myWolf.color + "\n");
        
        myWolf.move();
        myWolf.howling();
        myWolf.running();
        myWolf.sitting();
        myWolf.hunting();
    }
}