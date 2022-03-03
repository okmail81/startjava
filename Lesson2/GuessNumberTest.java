import java.util.Random;
    
import java.util.Scanner;
    
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        Player player1 = new Player(scan.nextLine());
        
        System.out.println("Введите имя второго игрока:");
        Player player2 = new Player(scan.nextLine());
        
        String answer = "yes";
        
        Random random = new Random();
        
        while(answer.equals("yes")) {
            int randomNumber = random.nextInt(100);
            GuessNumber guessNumber = new GuessNumber(player1, player2, randomNumber);
            guessNumber.Guess();
            answer = "";
            while(!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Хотите продолжать игру? [yes/no]:");
                answer = scan.nextLine();
            }
        }
    }
}