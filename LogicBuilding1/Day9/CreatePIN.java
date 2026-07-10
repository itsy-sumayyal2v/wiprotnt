import java.util.Scanner;

public class CreatePIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alpha: ");
        int alpha = sc.nextInt();

        System.out.print("Enter Beta: ");
        int beta = sc.nextInt();

        System.out.print("Enter Gamma: ");
        int gamma = sc.nextInt();

        int pin = maxDigit(alpha) * 100 + maxDigit(beta) * 10 + maxDigit(gamma);

        System.out.println("Generated PIN = " + pin);
    }

    static int maxDigit(int n) {
        int max = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max)
                max = digit;
            n /= 10;
        }
        return max;
    }
}