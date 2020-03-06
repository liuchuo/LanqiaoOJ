package begin2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		in.close();
		System.out.println((1 + n) * n / 2);
		
	}

}
