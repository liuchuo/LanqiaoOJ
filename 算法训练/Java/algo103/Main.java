package algo103;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int num = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				num += i;
			}
		}
		
		if (num == n && n != 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
