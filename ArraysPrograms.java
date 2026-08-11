import java.util.Scanner;

public class ArraysPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int sum = 0;
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("\n\nSum = " + sum);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
