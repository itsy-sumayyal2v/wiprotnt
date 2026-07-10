import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum += arr[i];
            }

            if (ignore && arr[i] == 7) {
                ignore = false;
            }
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}