import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Neha");

        // Create StringJoiner
        StringJoiner sj = new StringJoiner(", ", "{", "}");

        // Add names to StringJoiner
        for (String name : names) {
            sj.add(name);
        }

        // Display result
        System.out.println("Joined Names: " + sj);
    }
}