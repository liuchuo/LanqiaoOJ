package adv194;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < m; i++) {
			int n = Integer.parseInt(bufferedReader.readLine());
			Child[] childs = new Child[n];
			for (int j = 0; j < n; j++) {
				String[] t = bufferedReader.readLine().split(" ");
				childs[j] = new Child(Integer.parseInt(t[0]), Integer.parseInt(t[1]));
			}

			System.out.println(bankAlgorithm(childs));
		}
		bufferedReader.close();
	}

	private static String bankAlgorithm(Child[] childs) {
		Arrays.sort(childs);
		int currentNeed = 0;
		for (int i = 0; i < childs.length; i++) {
			if (childs[i].need <= 0) {
				currentNeed += childs[i].have;
			} else { // childs[i].need > 0
				if (currentNeed >= childs[i].need) {
					currentNeed += childs[i].have;
				} else {
					return "NO";
				}
			}
		}
		return "YES";
	}
}

class Child implements Comparable<Child> {
	int have;
	int total;
	int need;

	public Child(int have, int total) {
		this.have = have;
		this.total = total;
		this.need = total - have;
	}

	@Override
	public int compareTo(Child child) {
		return need - child.need;
	}

}