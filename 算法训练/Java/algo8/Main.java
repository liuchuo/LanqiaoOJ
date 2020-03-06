package algo8;
// 50%
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static int[] num = null;

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = bufferedReader.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		num = new int[1000000];
		String[] block = bufferedReader.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(block[i]);
		}
		for (int i = 0; i < m; i++) {
			String[] op = bufferedReader.readLine().split(" ");
			int p = Integer.parseInt(op[0]);
			switch (p) {
			case 1:
				Update(Integer.parseInt(op[1]), Integer.parseInt(op[2]));
				break;
			case 2:
				System.out.println(Sum(Integer.parseInt(op[1]), Integer.parseInt(op[2])));
				break;
			case 3:
				System.out.println(Max(Integer.parseInt(op[1]), Integer.parseInt(op[2])));
				break;

			}
		}
	}

	private static int Max(int x, int y) {
		int max = num[x - 1];
		for (int i = x; i < y; i++) {
			max = Integer.max(max, num[i]);
		}
		return max;

	}

	private static int Sum(int x, int y) {
		int sum = 0;
		for (int i = x - 1; i < y; i++) {
			sum += num[i];
		}
		return sum;
	}

	private static void Update(int x, int y) {
		num[x - 1] = y;
	}
}
