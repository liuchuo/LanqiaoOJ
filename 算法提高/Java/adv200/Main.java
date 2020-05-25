package adv200;
//ERROR.
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sumAi = 0;
		int sumBi = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int ai = in.nextInt();
			int bi = in.nextInt();
			
			if (ai + bi > 0 && sumAi + ai > 0 && sumBi + bi > 0) {
				sum += ai + bi;
				sumAi += ai;
				sumBi += bi;
			}
		}
		in.close();
		
		System.out.println(sum);
	}
}
