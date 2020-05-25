package adv170;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		int cnt = 0;
		while (num != 6174) {
			int max = getMax(num);
			int min = getMin(num);
			num = max - min;
			cnt++;
		}

		System.out.println(cnt);
	}

	private static int getMin(int num) {
		char[] cn = new String("" + num).toCharArray();
		Arrays.sort(cn);
		return Integer.parseInt(new String(cn));
	}

	private static int getMax(int num) {
		char[] cn = new String("" + num).toCharArray();
		Arrays.sort(cn);
		String string = "";
		for (int i = cn.length - 1; i >= 0; i--) {
			string += cn[i];
		}
		return Integer.parseInt(string);
	}
}
