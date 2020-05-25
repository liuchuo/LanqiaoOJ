package algo2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		long n = in.nextLong();
		in.close();

		if (n <= 2) {
			System.out.print(n);
			return;
		} 
		
		if (0 == n % 2) {
			// Even.
			if (0 != n % 3) {
				System.out.print((n * (n - 1) * (n - 3)));
			} else {
				System.out.print((n - 1) * (n - 2) * (n - 3));
			}
		} else {
			// Odd.
			System.out.print(n * (n - 1) * (n - 2));
		}
	}
}