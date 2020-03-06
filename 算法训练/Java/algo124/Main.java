package algo124;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[][] triple = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i;j++) {
				triple[i][j] = in.nextInt();
			}
		}
		in.close();
		
		int[][] result = new int[n][n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == 0) {
					result[i][j] = triple[i][j];
				} else if (j == 0) {
					result[i][j] = result[i-1][j] + triple[i][j];
				} else if (i == j){
					result[i][j] = result[i-1][j-1] + triple[i][j];
				} else {
					result[i][j] = Integer.max(result[i-1][j], result[i-1][j-1]) + triple[i][j];
				}
				
				if (result[i][j] > max) {
					max = result[i][j];
				}
			}
		}
		
		System.out.println(max);
	}
}