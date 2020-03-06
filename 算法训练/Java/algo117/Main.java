package algo117;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		if (b == factor(a) && a == factor(b)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	private static int factor(int a) {
		int sum = 0;
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
