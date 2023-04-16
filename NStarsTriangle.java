import java.util.Scanner;

public class NStarsTriangle {
	public static void main(String[] args) {
		System.out.println("Enter height of n stars: ");
		int N = new Scanner(System.in).nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - i; ++j) {
				System.out.print(" ");
			}

			int k = 0;
			while (k != 2 * i + 1) {
				System.out.print("*");
				++k;
			}

			System.out.println();
		}
	}
}
