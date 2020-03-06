package algo104;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		long x = inScanner.nextLong();
		inScanner.close();
		while (x % 10 != x) {
			long t = x;
			x = 1;
			while (t != 0) {
				if (t % 10 != 0) {
					x *= t % 10;
				}
				t /= 10;
			}
		}
		
		System.out.println(x);
	}

}
