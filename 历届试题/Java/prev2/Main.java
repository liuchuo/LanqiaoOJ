package prev2;

import java.util.Scanner;

public class Main {

	public static char[][] symbol = null;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = n * 4 + 5;
		in.close();
		symbol = new char[l][l];
		print(n, 0, 0, l, l);
	}

	public static void print(int n, int srow, int scol, int erow, int ecol) {
		for (int i = srow; i < erow; i++) {
			for (int j = scol; j < ecol; j++) {
				if ((i == srow || i == erow) && j >= scol + 2 && j < ecol - 2) {
					symbol[i][j] = '$';
				} else if ((j == scol || j == ecol) && i >= srow + 2 && j < erow - 2) {
					symbol[i][j] = '$';
				} else {
					symbol[i][j] = '.';
				}
			}
		}

		System.out.println(symbol);
	}
}
