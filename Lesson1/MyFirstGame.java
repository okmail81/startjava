public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 51;
        int playerNumber = 76;
        while(playerNumber != hiddenNumber) {
            if(playerNumber > hiddenNumber) {
                System.out.println("Число введенное игроком - " + playerNumber + ", данное число больше того, что загадал компьютер");
                playerNumber--;
            } else if(playerNumber < hiddenNumber) {
                System.out.println("Число введенное игроком - " + playerNumber + ", данное число меньше того, что загадал компьютер");
                playerNumber++;
            } 
        }
        System.out.println("Число введенное игроком - " + playerNumber + ", поздравляю, число угадано!");
    }
}