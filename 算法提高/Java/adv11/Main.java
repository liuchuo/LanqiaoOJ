package adv11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean[] prime = new boolean[2000000];
		setPrime(prime);
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		long sum = 1;
		for (int i = 2; i < prime.length && n > 0; i++) {
			if (prime[i]) {
				sum = sum * i % 50000;
				n--;
			}
		}

		System.out.println(sum);
	}

	private static void setPrime(boolean[] prime) {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}

		for (int i = 2; i * i < prime.length; i++) {
			for (int j = 2; i * j < prime.length; j++) {
				prime[i * j] = false;
			}
		}
	}

}
