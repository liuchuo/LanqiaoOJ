package algo106;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] c = in.nextLine().toCharArray();
		in.close();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'o' || c[i] == 'i' || c[i] == 'u') {
				System.out.println(i + 1);
				return;
			}
		}
		
		System.out.println(0);
	}

}
