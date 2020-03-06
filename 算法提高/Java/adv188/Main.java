package adv188;

import java.util.Scanner;

public class Main {
	
	public static final boolean[] isVisit = new boolean[10];
	public static final int[] num = new int[10];
	public static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		dfs(0, n);
		in.close();
	}
	
	public static boolean dfs(int step, int n) {
		if (step == 10) {
			cnt++;
			
			if (cnt == n) {
				for (int i = 0; i < 10; i++) {
					System.out.print(num[i]);
				}
				
				return true;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			if (!isVisit[i]) {
				isVisit[i] = true;
				num[step] = i;
				if (dfs(step+1, n) ) {
					return true;
				}
				isVisit[i]= false;
			}
		}
		return false;
	}
}