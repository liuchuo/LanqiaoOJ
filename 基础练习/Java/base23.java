package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] test = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                test[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j)
                    count += test[j][i];
            }
            if (count >= n / 2)
                System.out.print(i + 1 + " ");
        }

    }
}
