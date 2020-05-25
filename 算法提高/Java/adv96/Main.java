package adv96;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			a += in.nextInt();
			b += in.nextInt();
		}
		in.close();
		
		System.out.println(a + "+" + b + "i");
	}

}
