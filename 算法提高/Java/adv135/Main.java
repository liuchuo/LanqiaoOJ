package adv135;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		double s = (a + b + c) / 2.0;
		System.out.printf("%.2f", Math.sqrt(s * (s - a) * (s - b) * (s - c)));
	}

}
