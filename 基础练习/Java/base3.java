package algorithm.Lanqiao.基础练习;

import java.util.Scanner;
import java.lang.Math;

public class base3 {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        in.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((char) ('A' + Math.abs(i - j)));
            }
            System.out.println();
        }
    }
}
