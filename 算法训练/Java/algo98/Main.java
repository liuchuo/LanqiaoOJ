package algo98;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		LinkedList<Integer> stack = new LinkedList<>();
		do {
			stack.push(n % 10);
			n /= 10;
		} while (n != 0);
		
		while (stack.size() > 0) {
			System.out.print(stack.pop() + " ");
		}
	}

}
