package adv181;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean[] prime = new boolean[n + 1];
		in.close();
		List<Integer> p = setPrime(prime);
		int i = 0;
		int cnt = 0;
		while (n != 1) {
			while (n % p.get(i) == 0) {
				System.out.print(p.get(i) + " ");
				n /= p.get(i);
				cnt++;
			}
			i++;
		}
		System.out.println("\n" + cnt);
	}

	private static List<Integer> setPrime(boolean[] prime) {
		for (int i = 2; i < prime.length; i++) {
			prime[i] = true;
		}

		List<Integer> list = new ArrayList<>();
		for (int i = 2; i < prime.length; i++) {
			if (prime[i]) {
				list.add(i);
				for (int j = 2; j * i < prime.length; j++) {
					prime[j * i] = false;
				}
			}
		}
		return list;
	}

}
