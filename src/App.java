import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int tries = 3;
        System.out.println("Du ska gissa ett tal 1-10, du har 3 försök");

        double randomNum = Math.floor(Math.random() * 10);
        System.out.println(randomNum);
        while (true) {
            int userInput = scanner.nextInt();
            tries--;
            if (userInput > randomNum) {
                System.out.println("Du svarade för högt nummer");
            } else if (userInput < randomNum) {
                System.out.println("Du svarade för låg gissning");
            } else if (userInput == randomNum) {
                System.out.println("Du svarade rätt, grattis!");
                break;
            }

            System.out.println("Du har " + tries + " försök kvar");

            if (tries == 0) {
                System.out.println("Antal försök är slut!");
                break;
            }
        }
    }
}
