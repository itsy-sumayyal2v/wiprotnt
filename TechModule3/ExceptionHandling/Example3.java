import java.util.Scanner;

// Custom Exception for Negative Marks
class NegativeMarksException extends Exception {
    public NegativeMarksException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Range
class MarksOutOfRangeException extends Exception {
    public MarksOutOfRangeException(String message) {
        super(message);
    }
}

public class Example3 {

    // Method to validate marks
    static int validateMarks(String input)
            throws NumberFormatException, NegativeMarksException, MarksOutOfRangeException {

        int marks = Integer.parseInt(input);

        if (marks < 0) {
            throw new NegativeMarksException("Marks cannot be negative.");
        }

        if (marks > 100) {
            throw new MarksOutOfRangeException("Marks should be between 0 and 100.");
        }

        return marks;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {

            System.out.println("\nEnter details of Student " + i);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            int total = 0;

            for (int j = 1; j <= 3; j++) {

                while (true) {
                    try {
                        System.out.print("Enter marks of Subject " + j + ": ");
                        String input = sc.nextLine();

                        int marks = validateMarks(input);
                        total += marks;
                        break;

                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter only integer values.");

                    } catch (NegativeMarksException e) {
                        System.out.println("Error: " + e.getMessage());

                    } catch (MarksOutOfRangeException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }

            double average = total / 3.0;

            System.out.println("\nStudent Name : " + name);
            System.out.println("Average Marks: " + average);
        }

        sc.close();
    }
}