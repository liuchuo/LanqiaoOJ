package algo100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = scanner.nextInt();
		int max = scanner.nextInt();
		int factor = scanner.nextInt();
		scanner.close();
		for (int i = min; i <= max; i++) {
			if (i % factor == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
