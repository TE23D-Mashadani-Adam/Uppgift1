import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int tries = 3;
        System.out.println("Du ska gissa ett tal 1-10, du har 3 försök");

        double randomNum = Math.floor(Math.random() * 10) + 1; //Generar slumpmässigt tal
        System.out.println(randomNum);

        //Loopet körs så länge spelet är på
        while (true) {
            boolean correctInput = false;
            int userInput = 0;

            // Kollar att användaren skriver rätt Input
            while (!correctInput) {
                userInput = scanner.nextInt();
                if (userInput >= 0 && userInput <= 10) {
                    correctInput = true;
                } else {
                    System.out.println("Skriv gärna ett nummer från 1-10");
                }
            }

            tries--;
            if (userInput > randomNum) {
                System.out.println("Du svarade för högt nummer");
            } else if (userInput < randomNum) {
                System.out.println("Du svarade för låg gissning");
            } else {
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
