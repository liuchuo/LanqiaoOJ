package algo61;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		in.close();
		if (x % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
