import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Mango");
        ts.add("Grapes");

        // a) Reverse the elements
        System.out.println("TreeSet in Reverse Order:");
        Iterator<String> reverse = ts.descendingIterator();
        while (reverse.hasNext()) {
            System.out.println(reverse.next());
        }

        // b) Iterate using Iterator
        System.out.println("\nTreeSet using Iterator:");
        Iterator<String> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // c) Check if an element exists
        String element = "Mango";

        if (ts.contains(element)) {
            System.out.println("\n" + element + " exists in TreeSet.");
        } else {
            System.out.println("\n" + element + " does not exist in TreeSet.");
        }
    }
}