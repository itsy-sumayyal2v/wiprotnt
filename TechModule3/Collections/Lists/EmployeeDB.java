import java.util.ArrayList;

class EmployeeDB {

    ArrayList<Employee1> list = new ArrayList<>();

    // Add Employee
    public boolean addEmployee(Employee1 e) {
        return list.add(e);
    }

    // Delete Employee
    public boolean deleteEmployee(int empId) {

        for (Employee1 e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    // Show Payslip
    public String showPaySlip(int empId) {

        for (Employee1 e : list) {
            if (e.empId == empId) {
                return "Pay Slip of " + e.empName +
                        "\nEmployee ID : " + e.empId +
                        "\nSalary : " + e.salary;
            }
        }

        return "Employee not found.";
    }

    // Display all employees
    public void displayEmployees() {

        for (Employee1 e : list) {
            e.getEmployeeDetails();
            System.out.println("------------------------");
        }
    }
}