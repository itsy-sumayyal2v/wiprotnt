import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (1 to 255): ");
        int number = sc.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Invalid input! Please enter a number between 1 and 255.");
        } else {
            String binary = Integer.toBinaryString(number);

            // Pad with leading zeros to make it 8 bits
            binary = String.format("%8s", binary).replace(' ', '0');

            System.out.println("Binary representation: " + binary);
        }

        sc.close();
    }
}