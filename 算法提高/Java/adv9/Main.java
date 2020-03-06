package adv9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] cs = in.next().toCharArray();
		in.close();
		reverse(cs, 0, n - 1);
		
		System.out.println();
		System.out.println(new String(cs));
	}

	private static void reverse(char[] cs, int i, int j) {
		if (j <= i) {
			return;
		}

		char c = cs[i];
		cs[i] = cs[j];
		cs[j] = c;
		System.out.println(new String(cs));
		reverse(cs, i + 1, j - 1);
	}
}
