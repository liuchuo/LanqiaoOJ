package begin4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] f= new int[1000001];
		f[1] = f[2] = 1;
		for (int i = 3; i <= 1000000; i++) {
			f[i] = (f[i-1] + f[i-2]) % 10007;
		}
		
		Scanner in = new Scanner(System.in);
		System.out.println(f[in.nextInt()]);
		in.close();
	}

}
