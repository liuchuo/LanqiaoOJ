package algo73;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] cs = in.nextLine().toCharArray();
		in.close();
		int cnt = 0;
		for (char c : cs) {
			if (c >= '0' && c <= '9') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
