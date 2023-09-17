import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
	    System.out.println("Enter elements:" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
        }
        MinMax(arr);

    }

    public static void MinMax(int[] arr) {
        if (arr.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
    }
}
