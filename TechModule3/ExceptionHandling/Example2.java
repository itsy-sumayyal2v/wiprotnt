class Example2 {
    public static void main(String[] args) {
        try {
            // Check if exactly 5 arguments are provided
            if (args.length != 5) {
                System.out.println("Please provide exactly 5 integers as command line arguments.");
                return;
            }

            int[] arr = new int[5];
            int sum = 0;

            // Convert command line arguments to integers
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }

            // Calculate sum
            for (int num : arr) {
                sum += num;
            }

            // Calculate average
            double average = (double) sum / arr.length;

            // Display results
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter only integer values.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Insufficient command line arguments.");
        } catch (Exception e) {
            System.out.println("Unexpected Exception: " + e.getMessage());
        }
    }
}