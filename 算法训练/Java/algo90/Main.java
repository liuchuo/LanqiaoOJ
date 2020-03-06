package algo90;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if (n <= 20 && n > 0) {
			int[] array = new int[n];

			for (int i = 0; i < n; i++) {
				array[i] = in.nextInt();
			}

			int maxCnt = 1;
			int value = array[0];
			int tempMaxCnt = 1;
			int tempValue = array[0];
			for (int i = 1; i < n; i++) {
				if (array[i] == tempValue) {

					tempMaxCnt++;
					if (tempMaxCnt > maxCnt) {
						maxCnt = tempMaxCnt;
						value = tempValue;
					}
				} else {
					tempMaxCnt = 1;
					tempValue = array[i];
				}
			}

			System.out.println(value);

		}

		in.close();

	}

}
