package algo39;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(in.nextInt());
		}
		in.close();
		for (int i : set) {
			System.out.println(i);
		}
	}
}
