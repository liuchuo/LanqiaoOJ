package prev33;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		
		final int BLACK = 1;
		final int WHITE = 0;
		
		int[][] maxtrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				maxtrix[i][j] = in.nextInt();
			}
		}
		
		int x = in.nextInt();
		int y = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		in.close();
		
		for (int i = 0; i < k; i++) {
			if (s.equals("U")) {
				if (maxtrix[x][y] == BLACK) {
					s = "R";
					maxtrix[x][y] = WHITE;
					y++;
				} else if (maxtrix[x][y] == WHITE) {
					s = "L";
					maxtrix[x][y] = BLACK;
					y--;
				} else {
					System.out.println("Are your square crack?");
				}
			} else if (s.equals("D")) {
				if (maxtrix[x][y] == BLACK) {
					s = "L";
					maxtrix[x][y] = WHITE;
					y--;
				} else if (maxtrix[x][y] == WHITE) {
					s = "R";
					maxtrix[x][y] = BLACK;
					y++;
				} else {
					System.out.println("Are your square crack?");
				}
			} else if (s.equals("L")) {
				if (maxtrix[x][y] == BLACK) {
					s = "U";
					maxtrix[x][y] = WHITE;
					x--;
				} else if (maxtrix[x][y] == WHITE) {
					s = "D";
					maxtrix[x][y] = BLACK;
					x++;
				} else {
					System.out.println("Are your square crack?");
				}
			} else if (s.equals("R")) {
				if (maxtrix[x][y] == BLACK) {
					s = "D";
					maxtrix[x][y] = WHITE;
					x++;
				} else if (maxtrix[x][y] == WHITE) {
					s = "U";
					maxtrix[x][y] = BLACK;
					x--;
				} else {
					System.out.println("Are your square crack?");
				}
			} else {
				System.out.println("Your direction have some errors.");
			}
			
//			print(maxtrix, m, n);
		}
		
		System.out.println(x + " " + y);
	}
	
	public static void print(int[][] maxtrix, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(maxtrix[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}