package algo143;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		in.close();
		String tmp = null;
		switch (n) {
		case 1:
			tmp = allUpper(s);
			break;
		case 2:
			tmp = allLower(s);
			break;
		case 3:
			tmp = reverseString(s);
			break;
		case 4:
			tmp = exchange(s);
			break;
		case 5:
			tmp = link(s);
			break;
		}

		System.out.println(tmp);
	}

	private static String link(String s) {
		char[] c = allLower(s).toCharArray();
		char[] t = new char[c.length];
		t[0] = c[0];
		for (int i = 1; i < c.length; i++) {
			if (i < c.length - 1 && c[i] - 1 == c[i - 1] && c[i] + 1 == c[i + 1]) {
				t[i] = '-';
			} else {
				t[i] = c[i];
			}
		}

		String a = new String();
		for (char i : t) {
			if (i == '-' && a.charAt(a.length() - 1) != '-') {
				a += '-';
			} else if (i != '-') {
				a += i;
			}
		}
		return a;
	}

	private static String exchange(String s) {
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				c[i] += 32;
			} else {
				c[i] -= 32;
			}
		}
		return new String(c);
	}

	private static String reverseString(String s) {
		return new StringBuffer(s).reverse().toString();
	}

	private static String allLower(String s) {
		return s.toLowerCase();
	}

	private static String allUpper(String s) {
		return s.toUpperCase();
	}

}
