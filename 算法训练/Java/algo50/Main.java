package algo50;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = in.nextInt();
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			int temp = in.nextInt();
			if (temp % b != 0) {
				set.add(temp);
			}
		}
		in.close();
		
		for (int i : set) {
			if (i >= 'A' && i <= 'Z') {
				System.out.print((char)i + " ");
			} else {
				System.out.print(i + " ");
			}
		}
	}

}
