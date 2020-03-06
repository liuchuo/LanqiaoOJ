package algo150;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		System.out.println(recu(k, n));
	}
	
	private static int recu(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		}
		return recu(k, n - 1) + recu(k - 1, n - 1);
	}
}
