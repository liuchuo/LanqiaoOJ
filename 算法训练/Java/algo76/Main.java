package algo76;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dec = scanner.nextInt();
		scanner.close();
		System.out.println(Integer.toOctalString(dec));
	}

}
