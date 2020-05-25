package prev8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		boolean[] p = new boolean[a * a + b * b + 1];
		for (int i = 0; i <= b; i++) {
			for (int j = 0; j <= a; j++) {
				p[i * a + b * j] = true;
			}
		}

		for (int i = p.length - 1; i >= 0; i--) {
			if (p[i] == false && i <= a * b) {
				System.out.println(i);
				return;
			}
		}
	}
}
