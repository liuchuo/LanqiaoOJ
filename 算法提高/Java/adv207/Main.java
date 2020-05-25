package adv207;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] aString = in.next().toCharArray();
		char[] bString = in.next().toCharArray();
		in.close();

		int[][] len = new int[aString.length][bString.length];
		for (int i = 0; i < aString.length; i++) {
			for (int j = 0; j < bString.length; j++) {
				if (aString[i] == bString[j]) {
					if (i > 0 && j > 0) {
						len[i][j] = len[i - 1][j - 1] + 1;
					} else {
						len[i][j] = 1;
					}
				} else {
					if (i > 0 && j > 0) {
						len[i][j] = Integer.max(len[i - 1][j], len[i][j - 1]);
					} else {
						if (i > 0) {
							len[i][j] = len[i - 1][j];
						} else if (j > 0) {
							len[i][j] = len[i][j - 1];
						}

					}
				}
			}
		}
		System.out.println(len[aString.length - 1][bString.length - 1]);
	}

}
