public class EmployeeManagement {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee1 e1 = new Employee1(101, "Rahul",
                "rahul@gmail.com", "Male", 50000);

        Employee1 e2 = new Employee1(102, "Priya",
                "priya@gmail.com", "Female", 60000);

        Employee1 e3 = new Employee1(103, "Amit",
                "amit@gmail.com", "Male", 45000);

        // Add Employees
        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("Employee Details");
        db.displayEmployees();

        // Delete Employee
        System.out.println("\nDelete Employee with ID 102");
        db.deleteEmployee(102);

        System.out.println("\nEmployees After Deletion");
        db.displayEmployees();

        // Show Payslip
        System.out.println("\nPay Slip");
        System.out.println(db.showPaySlip(101));
    }
}