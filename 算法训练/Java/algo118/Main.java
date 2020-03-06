package algo118;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		for (int i = 1; i < n; i++) {

			double tmp = 0.5 + Math.sqrt(2 * n + i * i - i + 0.25);
			int b = (int)tmp;
			if (Math.abs(b - tmp) <= 0.000001) {
				System.out.println(i + " " + (b - 1));
			}
		}
	}

}
