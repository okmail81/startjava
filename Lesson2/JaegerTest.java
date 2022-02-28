public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Tacit Ronin");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Japan");
        jaeger1.setHeight(244f);
        jaeger1.setWeight(7450f);
        jaeger1.setSpeed(8);
        jaeger1.setStrenght(7);
        jaeger1.setArmor(3);
        
        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Coyote Tango");
        jaeger2.setMark("Mark-1");
        jaeger2.setOrigin("Japan");
        jaeger2.setHeight(280f);
        jaeger2.setWeight(2312f);
        jaeger2.setSpeed(5);
        jaeger2.setStrenght(7);
        jaeger2.setArmor(3);
        
        System.out.println("Имя первого егеря - " + jaeger1.getModelName());
        System.out.println("Имя второго егеря - " + jaeger2.getModelName());
        
        String Mark1 = jaeger1.getMark();
        String Mark2 = jaeger2.getMark();
        System.out.println("Серия первого егеря - " + Mark1);
        System.out.println("Серия второго егеря - " + Mark2);
        if(Mark1.equals(Mark2)) {
            System.out.println("Серии егерей равны");
        } else {
            System.out.println("Серии егерей различны");
        }
        
        String Origin1 = jaeger1.getOrigin();
        String Origin2 = jaeger2.getOrigin();
        System.out.println("Страна производитель первого егеря - " + Origin1);
        System.out.println("Страна производитель второго егеря - " + Origin2);
        if(Origin1.equals(Origin2)) {
            System.out.println("Егеря произведены в одной стране");
        } else {
            System.out.println("Егеря произведены в различных странах");
        }
        
        float Height1 = jaeger1.getHeight();
        float Height2 = jaeger2.getHeight();
        System.out.println("Рост первого егеря - " + Height1);
        System.out.println("Рост второго егеря - " + Height2);
        if(Height1 == Height2) {
            System.out.println("Рост егерей одинаков");
        } else {
            System.out.println("Рост егерей различный");
        }
        
        float Weight1 = jaeger1.getWeight();
        float Weight2 = jaeger2.getWeight();
        System.out.println("Вес первого егеря - " + Weight1);
        System.out.println("Вес второго егеря - " + Weight2);
        if(Weight1 == Weight2) {
            System.out.println("Вес егерей одинаков");
        } else {
            System.out.println("Вес егерей различный");
        }
        
        int Speed1 = jaeger1.getSpeed();
        int Speed2 = jaeger2.getSpeed();
        System.out.println("Скорость первого егеря - " + Speed1);
        System.out.println("Скорость второго егеря - " + Speed2);
        if(Speed1 == Speed2) {
            System.out.println("Скорость егерей одинакова");
        } else {
            System.out.println("Скорость егерей различна");
        }
        
        int Strenght1 = jaeger1.getStrenght();
        int Strenght2 = jaeger2.getStrenght();
        System.out.println("Сила первого егеря - " + Strenght1);
        System.out.println("Сила второго егеря - " + Strenght2);
        if(Strenght1 == Strenght2) {
            System.out.println("Сила егерей одинакова");
        } else {
            System.out.println("Сила егерей различна");
        }
        
        int Armor1 = jaeger1.getArmor();
        int Armor2 = jaeger2.getArmor();
        System.out.println("Броня первого егеря - " + Armor1);
        System.out.println("Броня второго егеря - " + Armor2);
        if(Armor1 == Armor2) {
            System.out.println("Броня егерей одинакова");
        } else {
            System.out.println("Броня егерей различна");
        }
        
        jaeger2.setArmor(4);
        Armor1 = jaeger1.getArmor();
        Armor2 = jaeger2.getArmor();
        System.out.println("\nБроня первого егеря - " + Armor1);
        System.out.println("Броня второго егеря - " + Armor2);
        if(Armor1 == Armor2) {
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