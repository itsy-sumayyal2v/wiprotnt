import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

// Employee class
class Employee {
    int empId;
    String empName;
    double salary;

    // Constructor
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Display employee details
    public String toString() {
        return "Employee ID: " + empId +
               ", Name: " + empName +
               ", Salary: " + salary;
    }
}

// Main class
public class EmployeeVector {
    public static void main(String[] args) {

        // Create a Vector to store Employee objects
        Vector<Employee> employees = new Vector<Employee>();

        // Add Employee objects
        employees.add(new Employee(101, "Rahul", 50000));
        employees.add(new Employee(102, "Priya", 60000));
        employees.add(new Employee(103, "Amit", 55000));

        // Display using Iterator
        System.out.println("Employees using Iterator:");
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Display using Enumeration
        System.out.println("\nEmployees using Enumeration:");
        Enumeration<Employee> en = employees.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}