package prev3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int cnt = 0, num = 0;
	public static boolean isVisit[] = new boolean[10];

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(reader.readLine());
		reader.close();
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (9 - i - j >= 1) {
					dfs(0, 0, 0, i, j, 9 -i - j);
				}
			}
		}
		System.out.println(cnt);
	}

	public static void dfs(int a, int b, int c, int alen, int blen, int clen) {
		if (alen == 0 && 0 == blen && 0 == clen) {
			if (b % c == 0 && b / c == num - a) {
				cnt++;
			}
			return;
		}

		for (int i = 1; i < 10; i++) {
			if (!isVisit[i]) {
				isVisit[i] = true;
				if (0 < alen) {
					dfs(a * 10 + i, b, c, alen - 1, blen, clen);
				} else if (0 < blen) {
					dfs(a, b * 10 + i, c, alen, blen - 1, clen);
				} else if (0 < clen) {
					dfs(a, b, c * 10 + i, alen, blen, clen - 1);
				}
				isVisit[i] = false;
			}
		}
	}
}
