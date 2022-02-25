public class Wolf {
    private char sex;
    private String nickname;
    private float weight;
    private int age;
    private String color;
    
    public char getSex() {
        return sex;
    }
    
    void setSex(char sex) {
        this.sex = sex;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public float getWeight() {
        return weight;
    }
    
    void setWeight(float weight) {
        this.weight = weight;
    }
    
    public int getAge() {
        return age;
    }
    
    void setAge(int age) {
        if (age > 8 ) {
            System.out.println("Некорректный возраст");
        } else {
        this.age = age;
        }
    }
    
    public String getColor() {
        return color;
    }
    
    void setColor(String color) {
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