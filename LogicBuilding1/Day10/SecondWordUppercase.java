import java.util.*;

public class SecondWordUppercase {
    public static void main(String[] args) {
        String str = "Java programming language";

        String[] words = str.split(" ");

        if (words.length >= 2) {
            System.out.println(words[1].toUpperCase());
        } else {
            System.out.println("No second word");
        }
    }
}