package algo64;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c = in.next().charAt(0);
		in.close();
		if ('a' <= c && c <= 'z') {
			System.out.println("lower");
		} else if ('A' <= c && c <= 'Z') {
			System.out.println("upper");
		}
	}

}
