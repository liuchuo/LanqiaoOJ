package algo77;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		scanner.close();
		
		int dety = Math.abs(y1 - y2);
		int detx = Math.abs(x1 - x2);
		if (detx == 0) {
			System.out.println("INF");
		} else {
			System.out.println(dety / detx);
		}
	}

}
