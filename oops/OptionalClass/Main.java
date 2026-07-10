import java.util.Optional;

public class Main {

    // Method to validate employee object
    public static Employee validateEmployee(Employee emp)
            throws InvalidEmployeeException {

        return Optional.ofNullable(emp)
                .orElseThrow(() ->
                        new InvalidEmployeeException("Invalid Employee: Employee object is null."));
    }

    public static void main(String[] args) {

        // Change this to null to test the exception
        Employee emp = null;
        // Employee emp = new Employee(101, "John");

        try {
            Employee validEmp = validateEmployee(emp);
            validEmp.display();
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}