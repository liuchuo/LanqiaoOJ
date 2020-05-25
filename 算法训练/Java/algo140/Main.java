package algo140;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			in.next();
			double dj = in.nextDouble();
			int sl = in.nextInt();
			sum += sl * dj;
		}
		in.close();
		
		System.out.printf("%.6f", sum);
	}

}
