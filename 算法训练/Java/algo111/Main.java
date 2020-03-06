package algo111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[1001];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (num[x] == 0) {
				cnt++;
				num[x] = 1;
			}
		}
		in.close();
		
		System.out.println(cnt);
		for (int i = 1; i <= 1000; i++) {
			if (num[i] == 1) {
				System.out.print(i + " ");
			}
		}
	}

}
