package adv208;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = bufferedReader.readLine().split(" ");
		int ai = Integer.parseInt(temp[0]);
		int aj = Integer.parseInt(temp[1]);
		long[][] a = new long[ai][aj];
		for (int i = 0; i < ai; i++) {
			String[] string = bufferedReader.readLine().split(" ");
			for (int j = 0; j < aj; j++) {
				a[i][j] = Long.parseLong(string[j]);
			}
		}

		temp = bufferedReader.readLine().split(" ");
		int bi = Integer.parseInt(temp[0]);
		int bj = Integer.parseInt(temp[1]);
		long[][] b = new long[bi][bj];
		for (int i = 0; i < bi; i++) {
			String[] strings = bufferedReader.readLine().split(" ");
			for (int j = 0; j < bj; j++) {
				b[i][j] = Long.parseLong(strings[j]);
			}
		}
		bufferedReader.close();

		for (int i = 0; i < ai; i++) {
			for (int j = 0; j < bj; j++) {
				long multipy = 0;
				for (int k = 0; k < aj; k++) {
					multipy += a[i][k] * b[k][j];
				}
				System.out.print(multipy + " ");
			}
			System.out.println();
		}
	}

}
