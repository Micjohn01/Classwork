import java.util.Scanner;

public class DecimalEquivalent {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a binary number: ");
            int binary = input.nextInt();

            int decimalEquivalent = 0;
            int power = 0;

            while (binary != 0) {
                int digit = binary % 10;
                decimalEquivalent += digit * Math.pow(2, power);
                power++;
                binary /= 10;
            }

            System.out.println("Decimal equivalent: " + decimalEquivalent);
        }
    }
