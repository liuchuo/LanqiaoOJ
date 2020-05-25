package algo16;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int base = in.nextInt();
		in.close();

		int temp = num;
		LinkedList<String> ans = new LinkedList<>();
		do {
			int mod = temp % base;
			temp /= base;
			if (mod < 0) {
				mod -= base;
				temp += 1;
			}
			switch (mod) {
			case 0:
				ans.push("0");
				break;
			case 1:
				ans.push("1");
				break;
			case 2:
				ans.push("2");
				break;
			case 3:
				ans.push("3");
				break;
			case 4:
				ans.push("4");
				break;
			case 5:
				ans.push("5");
				break;
			case 6:
				ans.push("6");
				break;
			case 7:
				ans.push("7");
				break;
			case 8:
				ans.push("8");
				break;
			case 9:
				ans.push("9");
				break;
			case 10:
				ans.push("A");
				break;
			case 11:
				ans.push("B");
				break;
			case 12:
				ans.push("C");
				break;
			case 13:
				ans.push("D");
				break;
			case 14:
				ans.push("E");
				break;
			case 15:
				ans.push("F");
				break;
			case 16:
				ans.push("G");
				break;
			case 17:
				ans.push("H");
				break;
			case 18:
				ans.push("I");
				break;
			case 19:
				ans.push("J");
				break;
			case 20:
				ans.push("k");
				break;
				
			}
		} while (temp != 0);

		System.out.print(num + "=");
		while (!ans.isEmpty()) {
			System.out.print(ans.pop());
		}
		System.out.print("(base" + base + ")" );
	}
}
