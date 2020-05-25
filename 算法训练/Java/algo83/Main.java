package algo83;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = n;
		for (int i = n - 1; i >= 1; i--) {
			int temp = i * t;
			while (temp % 10 == 0) {
				temp /= 10;
			}
			t = temp % 100;
		}
		in.close();

		System.out.println(t % 10);
	}

}
