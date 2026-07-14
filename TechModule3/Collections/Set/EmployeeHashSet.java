import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Kiran");
        employees.add("Anjali");
        employees.add("Rahul"); // Duplicate (ignored)

        System.out.println("Employee Names:");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}