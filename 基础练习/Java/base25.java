package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

//Java idea报警告 代码冗余
public class base25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[200][200];
        for (int k = 0; k < n; k++) {
            for (int k1 = 0; k1 < m; k1++) {
                a[k][k1] = in.nextInt();
            }
        }
        int all = n * m;
        int i = 0, j = 0;
        while (all > 0) {
            while (i < m && a[i][j] != -1) {//down
                System.out.print(a[i][j] + " ");
                a[i][j] = -1;
                i++;
                all--;
            }
            i--;
            j++;
            while (j < n && a[i][j] != -1) {//right
                System.out.print(a[i][j] + " ");
                a[i][j] = -1;
                j++;
                all--;
            }
            j--;
            i--;
            while (i >= 0 && a[i][j] != -1) {//up
                System.out.print(a[i][j] + " ");
                a[i][j] = -1;
                i--;
                all--;
            }
            i++;
            j--;
            while (j >= 0 && a[i][j] != -1) {//left
                System.out.print(a[i][j] + " ");
                a[i][j] = -1;
                j--;
                all--;
            }
            j++;
            i++;
        }

    }
}
