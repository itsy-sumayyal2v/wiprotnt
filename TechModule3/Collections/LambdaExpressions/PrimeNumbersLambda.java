import java.util.ArrayList;
import java.util.Random;

public class PrimeNumbersLambda {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();

        // Add 25 random numbers (1-100)
        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100) + 1);
        }

        System.out.println("ArrayList:");
        System.out.println(al);

        System.out.println("Prime Numbers:");

        al.stream()
          .filter(PrimeNumbersLambda::isPrime)
          .forEach(System.out::println);
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}