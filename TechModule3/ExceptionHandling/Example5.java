// User-defined Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Example5 {

    public static void main(String[] args) {

        // Check number of command-line arguments
        if (args.length != 2) {
            System.out.println("Usage: java Person <Name> <Age>");
            return;
        }

        String name = args[0];

        try {
            int age = Integer.parseInt(args[1]);

            // Validate age
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be greater than or equal to 18 and less than 60.");
            }

            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
            System.out.println("Details accepted successfully.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be an integer.");

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}