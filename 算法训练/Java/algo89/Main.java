package algo89;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			char[] c = scanner.nextLine().toCharArray();
			char p = scanner.nextLine().charAt(0);
			scanner.close();
			for (int i = 0; c != null && i < c.length; i++) {
				if (c[i] != p) {
					System.out.print(c[i]);
				}
			}
		} catch (Exception exception) {

		}
	}
}
