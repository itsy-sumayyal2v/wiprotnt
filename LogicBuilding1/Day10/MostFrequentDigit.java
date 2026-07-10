import java.util.*;

public class MostFrequentDigit {
    public static void main(String[] args) {
        int num = 2233444445;

        int[] freq = new int[10];

        while (num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }

        int max = 0;
        int digit = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > max) {
                max = freq[i];
                digit = i;
            }
        }

        System.out.println("Most Frequent Digit = " + digit);
    }
}