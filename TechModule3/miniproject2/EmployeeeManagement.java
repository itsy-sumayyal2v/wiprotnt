import java.io.*;
import java.util.Scanner;

public class EmployeeeManagement {

    static final String FILE_NAME = "employee.txt";

    public static void addEmployee() {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw = new FileWriter(FILE_NAME, true);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            fw.write(id + "," + name + "," + age + "," + salary);
            fw.write("\n");

            fw.close();

            System.out.println("Employee Added Successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void displayEmployees() {

        try {

            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

            String line;

            System.out.println("\n-----Report-----");

            while ((line = br.readLine()) != null) {

                String emp[] = line.split(",");

                System.out.println(emp[0] + " " + emp[1] + " " + emp[2] + " " + emp[3]);
            }

            System.out.println("-----End of Report-----");

            br.close();

        } catch (IOException e) {
            System.out.println("No employee records found.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}