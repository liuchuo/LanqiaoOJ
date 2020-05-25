package prev23;

// get 66 score.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int t = in.nextInt();
		in.close();
		
		int[] f = new int[k * 2 + 1];
		f[1] = 1;
		for (int i = 2; i < 2 * k + 1; i++) {
			f[i] = (f[i-1] + i-1) % k;
		}
		
		int sum = f[1];
		for (int i = 1; i < t; i++) {
			
			int index = (n * i + 1) % (2 * k);
			if (index == 0) {
				index = 2 * k;
			}
			sum += f[index];
		}
		
		System.out.println(sum);
	}

}
