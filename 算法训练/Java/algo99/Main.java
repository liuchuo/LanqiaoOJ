package algo99;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		double salary = scanner.nextDouble();
		scanner.close();
		if (time < 40) {
			System.out.printf("%.2f", time * salary);
		} else if (time <= 50 && time >= 40) {
			System.out.printf("%.2f", 40 * salary + 1.5 * salary * (time -40));
		} else {
			System.out.printf("%.2f", 40 * salary + 1.5 * 10 * salary + (time - 50) * 2 * salary);
		}
	}

}
