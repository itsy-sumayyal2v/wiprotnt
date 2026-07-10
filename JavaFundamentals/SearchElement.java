import java.util.Scanner;

public class SearchElement {
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

        // Input search element
        System.out.print("Enter the element to search: ");
        int search = sc.nextInt();

        int index = -1;

        // Search for the element
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        // Display result
        System.out.println(index);

        sc.close();
    }
}