import java.util.ArrayList;

public class Months {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> months = new ArrayList<>();

        // Add all months of the year
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print the ArrayList
        System.out.println("Months of the Year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}