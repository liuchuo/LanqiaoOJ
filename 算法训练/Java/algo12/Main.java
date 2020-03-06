package algo12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		div(n);
	}

	private static void div(int n) {
		if (n == 0) {
			System.out.print(0);
			return;
		}
		
		char[] cs = Integer.toBinaryString(n).toCharArray();
		boolean isOutputFirst = false;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] == '1') {
				if (isOutputFirst) {
					if (cs.length - i - 1 == 1) {
						System.out.print("+2");
					} else {
						System.out.print("+2(");
						div(cs.length - 1 - i);
						System.out.print(")");
					}
				} else {
					if (cs.length - i - 1 == 1) {
						System.out.print(2);
					} else {
						System.out.print("2(");
						div(cs.length - 1 - i);
						System.out.print(")");
					}
					isOutputFirst = true;
				}
			}
		}
	}
}
