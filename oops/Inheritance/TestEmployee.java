public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Rahul",
                750000.0,
                2022,
                "NI123456");

        System.out.println("Employee Details");
        System.out.println("-------------------------");
        System.out.println("Name           : " + emp.getName());
        System.out.println("Annual Salary  : " + emp.getAnnualSalary());
        System.out.println("Year Started   : " + emp.getYearStarted());
        System.out.println("Insurance No.  : " + emp.getNationalInsuranceNumber());
    }
}