import java.util.Scanner;

public class DigitSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String option = sc.next(); // even or odd

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (option.equalsIgnoreCase("even")) {
                if (digit % 2 == 0)
                    sum += digit;
            } else if (option.equalsIgnoreCase("odd")) {
                if (digit % 2 != 0)
                    sum += digit;
            }

            n /= 10;
        }

        System.out.println(sum);
    }
}