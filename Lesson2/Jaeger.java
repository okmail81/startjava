public class jaeger {
    String modelName;
    String mark;
    String orogin;
    float height;
    float weight;
    int strenght;
    int armor;    
    
    boolean drift() {
        return true;
    }
    
    void move() {
        System.out.println("moving");
    }
    
    String scanKaiju() {
        return "scanning";
    }
    
    void useVortexCannon() {
        System.out.println("activated");
    }
}