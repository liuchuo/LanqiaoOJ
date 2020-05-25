package algo67;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = in.nextInt();
		int max = min;
		for (int i = 1; i <= 10; i++) {
			int t = in.nextInt();
			if (t > max) {
				max = t;
			} else if (t < min) {
				min = t;
			}
		}
		in.close();
		System.out.println(max + " " + min);
	}

}
