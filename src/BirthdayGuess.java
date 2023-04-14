import java.util.Scanner;

public class BirthdayGuess {
        public static void main(String[] args) {
            int birthMonth = 6;
            int birthYear = 1999;

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Guess my birthday date: ");
                int birthDate = scanner.nextInt();

                if (birthDate == 29 ) {
                    System.out.println("Correct Guess");
                    break;
                } else {
                    System.out.println("Incorrect Guess");
                }
            }
        }
    }
