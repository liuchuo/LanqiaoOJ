package adv155;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] query = new int[n];
		int q = in.nextInt();
		for (int i = 0; i < n; i++) {
			query[i] = in.nextInt();
		}

		for (int i = 0; i < q; i++) {
			System.out.println(partMin(query, in.nextInt(), in.nextInt()));
		}
		in.close();
	}

	public static int partMin(int[] query, int start, int end) {
		int min = query[start];
		for(int i = start; i <= end; i++) {
			if (query[i] < min) {
				min = query[i];
			}
		}
		return min;
	}

}
