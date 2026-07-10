import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];
        int max;

        System.out.println("Enter 9 integers:");

        // Read first element and initialize max
        arr[0][0] = sc.nextInt();
        max = arr[0][0];

        // Read remaining elements and find the biggest number
        for (int i = 0; i < 3; i++) {
            for (int j = (i == 0 ? 1 : 0); j < 3; j++) {
                arr[i][j] = sc.nextInt();

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        // Display the array
        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Display the biggest number
        System.out.println("The biggest number in the given array is " + max);

        sc.close();
    }
}