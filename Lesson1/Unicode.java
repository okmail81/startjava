public class Unicode {
    public static void main(String[] args) {
        for (int counter = 33; counter <= 126; counter++) {
            System.out.println("Номеру " + counter + " соответствует символ " + (char) counter);
        }
    }
}