package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int[][] sanjiao = new int[n][n + 1];
        for (int i = 0; i < sanjiao.length; i++) {
            for (int j = 1; j <= i + 1; j++) {
                if (i == 0) {
                    sanjiao[i][j] = 1;
                    System.out.print(sanjiao[i][j] + " ");
                } else {
                    sanjiao[i][j] = sanjiao[i - 1][j - 1] + sanjiao[i - 1][j];
                    System.out.print(sanjiao[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
