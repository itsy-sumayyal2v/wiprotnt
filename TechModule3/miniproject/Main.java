import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nMAIN MENU");
            System.out.println("1. Interest Calculator - SB");
            System.out.println("2. Interest Calculator - FD");
            System.out.println("3. Interest Calculator - RD");
            System.out.println("4. Exit");

            System.out.print("Enter your option: ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter Amount: ");
                        double sbAmount = sc.nextDouble();

                        System.out.print("Enter Account Type (Normal/NRI): ");
                        String type = sc.next();

                        SBAccount sb = new SBAccount(sbAmount, type);

                        System.out.println("Interest = Rs. " + sb.calculateInterest());
                        break;

                    case 2:

                        System.out.print("Enter FD Amount: ");
                        double fdAmount = sc.nextDouble();

                        System.out.print("Enter Number of Days: ");
                        int days = sc.nextInt();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        FDAccount fd = new FDAccount(fdAmount, days, age);

                        System.out.println("Interest = Rs. " + fd.calculateInterest());

                        break;

                    case 3:

                        System.out.print("Enter Monthly Amount: ");
                        double rdAmount = sc.nextDouble();

                        System.out.print("Enter Months (6/9/12/15/18/21): ");
                        int months = sc.nextInt();

                        System.out.print("Enter Age: ");
                        int rdAge = sc.nextInt();

                        RDAccount rd = new RDAccount(rdAmount, months, rdAge);

                        System.out.println("Interest = Rs. " + rd.calculateInterest());

                        break;

                    case 4:
                        System.out.println("Thank You.");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice.");
                }

            } catch (InvalidInputException e) {

                System.out.println(e.getMessage());
            }

        }
    }
}