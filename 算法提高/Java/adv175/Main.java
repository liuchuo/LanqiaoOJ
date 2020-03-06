package adv175;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static <T> void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] array = new int[3];
		array[0] = in.nextInt();
		array[1] = in.nextInt();
		array[2] = in.nextInt();

		Arrays.sort(array);
		for (int i = 2; i >= 0; --i) {
			System.out.print(array[i] + " ");
		}
		in.close();
	}
}
