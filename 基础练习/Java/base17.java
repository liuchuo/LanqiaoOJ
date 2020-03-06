package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

/**
 * BASIC-17 基础练习 矩阵乘法
 * 问题描述
 * 　　给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
 * 　　例如：
 * 　　A =
 * 　　1 2
 * 　　3 4
 * 　　A的2次幂
 * 　　7 10
 * 　　15 22
 * 输入格式
 * 　　第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
 * 　　接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
 * 输出格式
 * 　　输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
 * 样例输入
 * 2 2
 * 1 2
 * 3 4
 * 样例输出
 * 7 10
 * 15 22
 * <p>
 * 分析：竟然有一个！0次幂！矩阵的零次冥要输出单位矩阵！。。。（小柳柳卒，享年20）。。。
 *
 * @author cai
 */

public class base17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        long[][] a = new long[40][40];
        long[][] b = new long[40][40];
        long[][] t = new long[40][40];
        //输入
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextLong();
                t[i][j] = a[i][j];
            }
        }
        //0次幂  输出单位矩阵
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
            return;
        }
        //m次幂
        while (--m > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int k = n;
                    while (k > 0) {
                        b[i][j] += t[i][k - 1] * a[k - 1][j];
                        k--;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    t[i][j] = b[i][j];
                    b[i][j] = 0;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}