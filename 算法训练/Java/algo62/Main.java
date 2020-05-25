package algo62;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int m = in.nextInt();
		in.close();
		System.out.println(a * a % m);
	}

}
