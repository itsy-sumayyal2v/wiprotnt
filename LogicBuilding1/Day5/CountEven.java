import java.util.Scanner;

public class CountEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);

        sc.close();
    }
}