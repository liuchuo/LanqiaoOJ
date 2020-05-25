package adv214;

import java.util.Scanner;

public class Main {

	private final static double p = 3.1415926536;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		in.close();
		
		System.out.printf("%.10f ", p * r * r);
		System.out.printf("%.10f ", 4 * p * r * r);
		System.out.printf("%.10f ", 4.0 / 3 * p * r * r * r);
	}

}
