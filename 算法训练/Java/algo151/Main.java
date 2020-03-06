package algo151;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int cnt = 0;
		do {
			cnt++;
			n /= 2;
		} while (n != 0);
		System.out.println(cnt);
	}
}
