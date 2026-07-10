import java.util.Random;

// Abstract Class
abstract class Compartment {
    public abstract String notice();
}

// Ladies Compartment
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment: Reserved for Women.";
    }
}

// General Compartment
class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment: Open for all passengers.";
    }
}

// Luggage Compartment
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment: Only luggage is allowed.";
    }
}

// First Class Compartment
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class Compartment: Reserved for First Class passengers.";
    }
}

// Main Class
public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        // Create random compartments
        for (int i = 0; i < compartments.length; i++) {
            int choice = random.nextInt(4) + 1;

            switch (choice) {
                case 1:
                    compartments[i] = new Ladies();
                    break;
                case 2:
                    compartments[i] = new General();
                    break;
                case 3:
                    compartments[i] = new Luggage();
                    break;
                case 4:
                    compartments[i] = new FirstClass();
                    break;
            }
        }

        // Display notices
        System.out.println("Railway Compartments:");
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}