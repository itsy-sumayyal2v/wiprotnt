import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int n = str.length();

        String firstTwo = str.substring(0, 2);
        String result = "";

        for (int i = 0; i < n; i++) {
            result += firstTwo;
        }

        System.out.println(result);

        sc.close();
    }
}