public class Division {
        public static void main(String[] args) {
            int sum = 0;

            for (int num = 1; num <= 30; num++) {
                if (num % 3 == 0) {
                    sum = sum + num;
                }
            }

            System.out.println("The sum of integers between 1 and 30 is: " + sum);
        }
}
