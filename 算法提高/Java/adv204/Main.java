package adv204;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		int p = in.nextInt();
		in.close();
		System.out.println(((long)Math.pow((a % p), b)) % p);
	}

}
