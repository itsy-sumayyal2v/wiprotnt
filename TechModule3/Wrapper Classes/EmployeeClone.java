class Employee implements Cloneable {

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}

public class EmployeeClone {

    public static void main(String[] args) {

        try {

            Employee original = new Employee(101, "Ramya", 50000);

            Employee clone = (Employee) original.clone();

            // Modify original object
            original.empId = 102;
            original.empName = "Priya";
            original.salary = 60000;

            System.out.println("Original Employee:");
            original.display();

            System.out.println("Cloned Employee:");
            clone.display();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}