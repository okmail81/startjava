public class JaegerTest {
    public static void main(String[] args) {
        Jaeger Jaeger1 = new Jaeger();
        Jaeger1.setModelName("Tacit Ronin");
        Jaeger1.setMark("Mark-1");
        Jaeger1.setOrigin("Japan");
        Jaeger1.setHeight(244f);
        Jaeger1.setWeight(7450f);
        Jaeger1.setSpeed(8);
        Jaeger1.setStrenght(7);
        Jaeger1.setArmor(3);
        
        Jaeger Jaeger2 = new Jaeger();
        Jaeger2.setModelName("Coyote Tango");
        Jaeger2.setMark("Mark-1");
        Jaeger2.setOrigin("Japan");
        Jaeger2.setHeight(280f);
        Jaeger2.setWeight(2312f);
        Jaeger2.setSpeed(5);
        Jaeger2.setStrenght(7);
        Jaeger2.setArmor(3);
        
        System.out.println("Имя первого егеря - " + Jaeger1.getModelName());
        System.out.println("Имя второго егеря - " + Jaeger2.getModelName());
        
        String Mark1 = Jaeger1.getMark();
        String Mark2 = Jaeger2.getMark();
        System.out.println("Серия первого егеря - " + Mark1);
        System.out.println("Серия второго егеря - " + Mark2);
        if(Mark1.equals(Mark2)) {
            System.out.println("Серии егерей равны");
        } else {
            System.out.println("Серии егерей различны");
        }
        
        String Origin1 = Jaeger1.getOrigin();
        String Origin2 = Jaeger2.getOrigin();
        System.out.println("Страна производитель первого егеря - " + Origin1);
        System.out.println("Страна производитель второго егеря - " + Origin2);
        if(Origin1.equals(Origin2)) {
            System.out.println("Егеря произведены в одной стране");
        } else {
            System.out.println("Егеря произведены в различных странах");
        }
        
        float Height1 = Jaeger1.getHeight();
        float Height2 = Jaeger2.getHeight();
        System.out.println("Рост первого егеря - " + Height1);
        System.out.println("Рост второго егеря - " + Height2);
        if(Height1 == Height2) {
            System.out.println("Рост егерей одинаков");
        } else {
            System.out.println("Рост егерей различный");
        }
        
        float Weight1 = Jaeger1.getWeight();
        float Weight2 = Jaeger2.getWeight();
        System.out.println("Вес первого егеря - " + Weight1);
        System.out.println("Вес второго егеря - " + Weight2);
        if(Weight1 == Weight2) {
            System.out.println("Вес егерей одинаков");
        } else {
            System.out.println("Вес егерей различный");
        }
        
        int Speed1 = Jaeger1.getSpeed();
        int Speed2 = Jaeger2.getSpeed();
        System.out.println("Скорость первого егеря - " + Speed1);
        System.out.println("Скорость второго егеря - " + Speed2);
        if(Speed1 == Speed2) {
            System.out.println("Скорость егерей одинакова");
        } else {
            System.out.println("Скорость егерей различна");
        }
        
        int Strenght1 = Jaeger1.getStrenght();
        int Strenght2 = Jaeger2.getStrenght();
        System.out.println("Сила первого егеря - " + Strenght1);
        System.out.println("Сила второго егеря - " + Strenght2);
        if(Strenght1 == Strenght2) {
            System.out.println("Сила егерей одинакова");
        } else {
            System.out.println("Сила егерей различна");
        }
        
        int Armor1 = Jaeger1.getArmor();
        int Armor2 = Jaeger2.getArmor();
        System.out.println("Броня первого егеря - " + Armor1);
        System.out.println("Броня второго егеря - " + Armor2);
        if(Armor1 == Armor2) {
            System.out.println("Броня егерей одинакова");
        } else {
            System.out.println("Броня егерей различна");
        }
        
        Jaeger2.setArmor(4);
        Armor1 = Jaeger1.getArmor();
        Armor2 = Jaeger2.getArmor();
        System.out.println("\nБроня первого егеря - " + Armor1);
        System.out.println("Броня второго егеря - " + Armor2);
        if(Armor1 == Armor2) {
            System.out.println("Броня егерей одинакова\n");
        } else {
            System.out.println("Броня егерей различна\n");
        }
        
        Jaeger1.move();
        Jaeger2.move();
        
        Jaeger1.useVortexCannon();
        Jaeger2.useVortexCannon();
    }
}