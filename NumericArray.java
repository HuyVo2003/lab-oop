import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class NumericArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of element in array: ");
		int n = scanner.nextInt();

		System.out.println("Input array: ");
		int sum = 0;
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter value at index [" + i + "]: ");
			A[i] = scanner.nextInt();
			sum += A[i];
		}

		for (int i = 0; i < n - 1; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (A[i] > A[j]) {
					int t = A[i];
					A[i] = A[j];
					A[j] = t;
				}
			}
		}

		System.out.println("Array after sorting: " + Arrays.toString(A));
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + 1.0 * sum / n);
	}
}
