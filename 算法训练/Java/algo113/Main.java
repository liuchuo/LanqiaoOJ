package algo113;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		SortedMap<Integer, Integer> hash = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (!hash.containsKey(x)) {
				hash.put(x, 1);
			} else {
				int cnt = hash.get(x) + 1;
				hash.put(x, cnt);
			}
		}
		in.close();

		for (Integer key : hash.keySet()) {
			System.out.println(key + " " + hash.get(key));
		}
	}

}
