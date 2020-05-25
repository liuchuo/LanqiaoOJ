package algo120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] foods = new int[4];
		for (int i = 0; i < foods.length; i++) {
			foods[i] = in.nextInt();
		}
		in.close();

		// 1
		int cnt = 0;
		while (foods[0] >= 2 && foods[1] >= 1 && foods[3] >= 2) {
			foods[0] -= 2;
			foods[1] -= 1;
			foods[3] -= 2;
			cnt++;
		}
		System.out.println(cnt);

		// 2
		cnt = 0;
		while (foods[0] >= 1 && foods[1] >= 1 && foods[2] >= 1 && foods[3] >= 1) {
			for (int j = 0; j < foods.length; j++) {
				foods[j] -= 1;
			}
			cnt++;
		}
		System.out.println(cnt);

		// 3
		cnt = 0;
		while (foods[2] >= 2 && foods[3] >= 1) {
			foods[2] -= 2;
			foods[3] -= 1;
			cnt++;
		}
		System.out.println(cnt);

		// 4
		cnt = 0;
		while (foods[1] >= 3) {
			foods[1] -= 3;
			cnt++;
		}
		System.out.println(cnt);

		// 5
		cnt = 0;
		while (foods[0] >= 1 && foods[3] >= 1) {
			foods[0] -= 1;
			foods[3] -= 1;
			cnt++;
		}
		System.out.println(cnt);
	}
}
