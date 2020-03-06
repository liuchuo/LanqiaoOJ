package algo149;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		in.close();
		int sum = 1;
		for (int i = 1; i <= m; i++) {
			sum *= n;
			System.out.printf("%12d\t", sum);
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
