import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber;
    
    public GuessNumber(Player player1, Player player2, int randomNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.randomNumber = randomNumber;
    }
        
    public void Guess() {
        Scanner scan = new Scanner(System.in);
        
        while(player1.getNumber() != randomNumber && player2.getNumber() != randomNumber) {
            
            System.out.println("Введите число первого игрока:");
            player1.setNumber(scan.nextInt());
            if(player1.getNumber() > randomNumber) {
                System.out.println("Число введенное первым игроком больше того, что загадал компьютер");
            } else if(player1.getNumber() < randomNumber) {
                System.out.println("Число введенное первым игроком меньше того, что загадал компьютер");
            } else {
                System.out.println("Число угадано первым игроком! - " + player1.getName());
            continue;
            }
            
            System.out.println("Введите число второго игрока:");
            player2.setNumber(scan.nextInt());
            if(player2.getNumber() > randomNumber) {
                System.out.println("Число введенное вторым игроком больше того, что загадал компьютер");
            } else if(player2.getNumber() < randomNumber) {
                System.out.println("Число введенное вторым игроком меньше того, что загадал компьютер");
            } else {
                System.out.println("Число угадано вторым игроком!- " + player2.getName());
            continue;
            }
        }
    }
}