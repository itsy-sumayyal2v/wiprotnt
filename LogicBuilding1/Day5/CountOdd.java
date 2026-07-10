import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddCount = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println("Number of odd numbers: " + oddCount);

        sc.close();
    }
}