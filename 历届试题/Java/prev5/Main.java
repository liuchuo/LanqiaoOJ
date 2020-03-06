package prev5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();

		int min = 100000;
		int max = 0;
		int[] corrent = new int[100000];
		for (int i = 0; i < n; i++) {
			String[] id = in.nextLine().split(" ");

			for (int j = 0; j < id.length; j++) {
				if (!id[j].equals("")) {
					int num = Integer.parseInt(id[j]);
					corrent[num]++;

					if (num < min) {
						min = num;
					}

					if (max < num) {
						max = num;
					}
				}
			}
		}

		int dupilcate = 0, emp = 0;
		for (int i = min; i <= max; i++) {
			if (corrent[i] == 0) {
				emp = i;
			} else if (corrent[i] == 2) {
				dupilcate = i;
			}
		}

		System.out.println(emp + " " + dupilcate);
		in.close();
	}

}
