import java.util.ArrayList;
import java.util.Iterator;

public class StringList {

    // Method to print all elements using an Iterator
    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        // Create an ArrayList that stores only Strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Apple");
        names.add("Banana");
        names.add("Cherry");
        names.add("Mango");
        names.add("Orange");

        // Print all elements
        System.out.println("Elements of the ArrayList:");
        printAll(names);
    }
}