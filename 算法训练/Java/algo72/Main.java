package algo72;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		in.close();
		if (num >= 90 && num <= 100) {
			System.out.println("A");
		} else if (num >= 80 && num <= 89) {
			System.out.println("B");
		} else if (num >= 70 && num <= 79) {
			System.out.println("C");
		} else if (num >= 60 && num <= 69) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
	}

}
