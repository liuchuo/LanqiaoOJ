package algo85;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] binary = scanner.nextLine().toCharArray();
		scanner.close();
		int num = 0;
		int n = binary.length;
		for (int i = n - 1; i >= 0; i--) {
			if (binary[i] == '1') {
				num += Math.pow(2, n - i - 1);
			}
		}
		
		System.out.println(num);
	}

}
