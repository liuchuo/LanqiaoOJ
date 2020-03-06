package adv83;

import java.util.Scanner;

public class Main {

	private static int[] num;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		num = new int[9];
		in.close();
		dfs(0);
	}

	private static void dfs(int pos) {
		if (pos == 9) {
			int one = num[0] * 100 + num[1] * 10 + num[2];
			int two = num[3] * 100 + num[4] * 10 + num[5];
			int three = num[6] * 100 + num[7] * 10 + num[8];
			
			if (one * 2 == two && one * 3 == three) {
				System.out.println(one + " " + two + " " + three);
			}
			
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			if (isNotSelect(pos, i)) {
				num[pos] = i;
				dfs(pos + 1);
			}
		}
	}
	
	private static boolean isNotSelect(int pos, int value) {
		for (int i = 0; i < pos; i++) {
			if (num[i] == value) {
				return false;
			}
		}
		return true;
	}

}
