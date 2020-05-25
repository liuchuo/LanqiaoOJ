package adv185;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 2; i < 200000; i++) {
			int temp = i;
			int sum = 0;
			while (temp != 0) {
				sum += Math.pow(temp % 10, 5);
				temp /= 10;
			}
			
			if (sum == i) {
				System.out.println(i);
			}
		}
		in.close();
	}

}
