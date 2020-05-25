package algo70;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		for (int i = 1; i < 5; i++) {
			String t = in.next();
			if (t.length() > s.length()) {
				s = t;
			}
		}
		in.close();
		
		System.out.println(s);
	}

}
