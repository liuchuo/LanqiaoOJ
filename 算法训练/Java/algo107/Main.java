package algo107;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0, b = 0;
		for (int i = 0; i < 10; i++) {
			a += in.nextInt();
			b += in.nextInt();
		}
		in.close();
		System.out.println(a + "+" + b + "i");
	}

}
