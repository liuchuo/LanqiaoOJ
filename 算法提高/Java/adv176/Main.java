package adv176;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int t = in.nextInt();
			if (m + 30 >= t) {
				cnt++;
			}
		}
		in.close();

		System.out.println(cnt);
	}

}
