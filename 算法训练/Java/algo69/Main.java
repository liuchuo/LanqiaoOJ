package algo69;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] cs = in.nextLine().toCharArray();
		in.close();
		for (int i = cs.length - 1; i >= 0; i--) {
			System.out.print(cs[i]);
		}
	}

}
