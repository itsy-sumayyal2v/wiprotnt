import java.util.*;

public class WeightOfString {
    public static void main(String[] args) {
        String str = "ABC";

        int weight = 0;

        for (int i = 0; i < str.length(); i++) {
            weight += str.charAt(i);
        }

        System.out.println("Weight = " + weight);
    }
}