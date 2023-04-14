import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, largest, secondLargest, number;

        System.out.print("Enter the number of elements you want to enter: ");
        num = input.nextInt();

        largest = Integer.MIN_VALUE;
        secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter " + num + " numbers:");
        for (int i = 0; i < num; i++) {
            number = input.nextInt();
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}