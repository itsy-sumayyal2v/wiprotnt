import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];
        int index = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Store even numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                result[index++] = arr[i];
        }

        // Store odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0)
                result[index++] = arr[i];
        }

        System.out.println("Result Array:");
        for (int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
    }
}