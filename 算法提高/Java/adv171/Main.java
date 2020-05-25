package adv171;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id = in.nextLine();
		in.close();
		int[] idNums = new int[18];
		idNums[6] = 1;
		idNums[7] = 9;
		for (int i = 0; i < id.length(); i++) {
			if (i < 6) {
				idNums[i] = id.charAt(i) - '0';
			} else {
				idNums[i + 2] = id.charAt(i) - '0';
			}
		}

		int mod = (idNums[0] * 7 + idNums[1] * 9 + idNums[2] * 10 + idNums[3] * 5 + idNums[4] * 8 + idNums[5] * 4
				+ idNums[6] * 2 + idNums[7] * 1 + idNums[8] * 6 + idNums[9] * 3 + idNums[10] * 7 + idNums[11] * 9
				+ idNums[12] * 10 + idNums[13] * 5 + idNums[14] * 8 + idNums[15] * 4 + idNums[16] * 2) % 11;

		switch (mod) {
		case 0:
			idNums[17] = 1;
			break;
		case 1:
			idNums[17] = 0;
			break;
		case 2:
			idNums[17] = -1;
			break;
		case 3:
			idNums[17] = 9;
			break;
		case 4:
			idNums[17] = 8;
			break;
		case 5:
			idNums[17] = 7;
			break;
		case 6:
			idNums[17] = 6;
			break;
		case 7:
			idNums[17] = 5;
			break;
		case 8:
			idNums[17] = 4;
			break;
		case 9:
			idNums[17] = 3;
			break;
		case 10:
			idNums[17] = 2;
			break;

		}

		for (int i = 0; i <= 17; i++) {
			if (i != 17) {
				System.out.print(idNums[i]);

			} else {
				if (idNums[17] == -1) {
					System.out.print("x");
				} else {
					System.out.print(idNums[17]);
				}
			}
		}
	}
}
