package algo71;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		in.close();
		if (s1.equals(s2)) {
			System.out.println(0);
		} else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			int i = 0;
			while (c1[i] == c2[i]) {
				i++;
			}
			System.out.println(c1[i] - c2[i]);
		}
	}

}
