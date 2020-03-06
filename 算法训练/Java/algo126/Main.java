package algo126;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int num = inScanner.nextInt();
		inScanner.close();

		int a = num % 10;
		int b = num / 10 % 10;
		int c = num / 100;
		if (a * a * a + b * b * b + c * c * c == num) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
