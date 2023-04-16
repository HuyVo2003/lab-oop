import java.util.Scanner;

public class SumMatrices {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of cols: ");
		int cols = scanner.nextInt();

		int A[][] = new int[rows][cols], B[][] = new int[rows][cols], C[][] = new int[rows][cols];

		System.out.println("Input first matrix: ");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				System.out.println("Input value at index [" + i + "][" + j + "]: ");
				A[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Input second matrix: ");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				System.out.println("Input value at index [" + i + "][" + j + "]: ");
				B[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}

		System.out.println("Sum of two matrics: ");
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				System.out.print(C[i][j] + " ");
			}

			System.out.println();
		}
	}
}
