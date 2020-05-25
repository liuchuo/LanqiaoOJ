package algo119;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		inScanner.close();
		int[] lone = new int[n+1];
		for (int i = 1; i <= n; i++) {
			int tmp = i;
			int num = i;
			while (tmp != 0) {
				num += tmp % 10;
				tmp /= 10;
			}
			if (num <= n) {
				lone[num] = 1;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (lone[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
