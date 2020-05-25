package algo93;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		System.out.println(reverse(reverse(a) + reverse(b)));
	}

	private static int reverse(int n) {
		int num = 0;
		while (n != 0) {
			num = num * 10 + n % 10;
			n /= 10;
		}
		return num;
	}

}
