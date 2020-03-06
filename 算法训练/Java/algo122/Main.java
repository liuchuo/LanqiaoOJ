package algo122;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		in.close();
		
		System.out.println(f(m, n));
	}
	
	public static int f(int m, int n) {
		// m is return, n is led.
		if (n > m) {
			//借鞋的人比还鞋的人多，则无法组成组合
			return 0;
		}
		
		if (n == 0) {
			//没人借鞋，则就是一种排列
			return 1;
		}
		
		//第一个是借鞋的人 + 第一个是还鞋的人
		return f(m-1, n) + f(m, n-1);
	}

}
