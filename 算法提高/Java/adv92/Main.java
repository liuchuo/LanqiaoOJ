package adv92;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(gcd(in.nextInt(), in.nextInt()));
		in.close();
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}
