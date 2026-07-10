import java.util.Scanner;

public class AllDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = Math.abs(sc.nextLong());

        if (num == 0) {
            System.out.println("Total digits = 1");
            return;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println("Total digits = " + count);
        sc.close();
    }
}