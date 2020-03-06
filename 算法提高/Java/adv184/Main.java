package adv184;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean[] prime = new boolean[n+1];
		in.close();
		setPrime(prime);
		long sum = 0;
		for (int i = 2; i < prime.length; i++) {
			if (prime[i]) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

	private static void setPrime(boolean[] prime) {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i < prime.length; i++) {
			for (int j = 2; i * j < prime.length; j++) {
				prime[i * j] = false;
			}
		}
	}
}
