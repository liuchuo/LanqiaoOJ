package algo68;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			Integer.parseInt(in.nextLine());
			System.out.println("yes");
		} catch (NumberFormatException numberFormatException) {
			System.out.println("no");
		} finally {
			in.close();
		}
	}

}
