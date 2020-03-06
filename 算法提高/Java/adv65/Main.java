package adv65;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = in.nextInt();
		int j = in.nextInt();
		in.close();

		for (int p = 1; p <= n; p++) {
			System.out.print("(" + i + "," + p + ")");
		}
		System.out.println();

		for (int p = 1; p <= n; p++) {
			System.out.print("(" + p + "," + j + ")");
		}
		System.out.println();
		
		for (int p = 1; p <= n; p++) {
			for (int q = 1; q <= n; q++) {
				if (q - p == j - i) {
					System.out.print("(" + p + "," + q + ")");
				}
			}
		}
		System.out.println();
		
		for (int p = 1; p <= n; p++) {
			for (int q = 1; q <= n; q++) {
				if (q + p == j + i) {
					System.out.print("(" + q + "," + p + ")");
				}
			}
		}
	}

}
