package adv213;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float balance = in.nextFloat();
		float ratio = in.nextFloat();
		in.close();
		System.out.printf("%.2f", (float)(balance + balance * 0.95 * ratio / 100.0));
	}

}
