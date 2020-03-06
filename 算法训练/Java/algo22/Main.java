package algo22;

import java.util.Scanner;

public class Main {

	static int ans = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		in.close();
		int[] num = new int[k];
		dfs(n, k, num);
		System.out.println(ans);
	}

	public static void dfs(int n, int k, int[] num) {
		if (k == 1 && n > 1) {
			ans++;
			return ;
		}
		
		int len = num.length;
		int i = 1;
		if (k == len) {
			i = num[k];
		}
		for (; i <= n / k; i++) {
			num[len - k] = i;
			dfs(n - i, k - 1, num);
		}
	}
}
