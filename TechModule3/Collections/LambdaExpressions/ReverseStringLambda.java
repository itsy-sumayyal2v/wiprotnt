import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Banana");
        al.add("Cat");
        al.add("Dog");
        al.add("Elephant");
        al.add("Fish");
        al.add("Goat");
        al.add("Horse");
        al.add("Ice");
        al.add("Jug");

        Collections.reverse(al);

        System.out.println("Strings in Reverse Order:");

        al.forEach(str -> System.out.println(str));
    }
}