package adv95;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		in.close();
		if (a.compareTo(b) < 0) {
			System.out.println("-1");
		} else if (a.compareTo(b) > 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
