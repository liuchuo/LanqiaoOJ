package adv102;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] strings = in.nextLine().split(" ");
		in.close();
		System.out.println(strings.length);
	}

}
