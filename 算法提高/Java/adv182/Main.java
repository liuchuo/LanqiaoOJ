package adv182;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[10];
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int t = in.nextInt();
			int j = 0;
			for (; num[j] >= t && j <= 9; j++) {
			}
			for (int k = 9; k > j; k--) {
				num[k] = num[k - 1];
			}
			if (j <= 9) {
				num[j] = t;
			}
		}
		in.close();
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
