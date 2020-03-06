package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

/**
 * BASIC-30 基础练习 阶乘计算
 * 问题描述
 * 　　输入一个正整数n，输出n!的值。
 * 　　其中n!=1*2*3*…*n。
 * 算法描述
 * 　　n!可能很大，而计算机能表示的整数范围有限，需要使用高精度计算的方法。使用一个数组A来表示一个大整数a，A[0]表示a的个位，A[1]表示a的十位，依次类推。
 * 　　将a乘以一个整数k变为将数组A的每一个元素都乘以k，请注意处理相应的进位。
 * 　　首先将a设为1，然后乘2，乘3，当乘到n时，即得到了n!的值。
 * 输入格式
 * 　　输入包含一个正整数n，n<=1000。
 * 输出格式
 * 　　输出n!的准确值。
 * 样例输入
 * 10
 * 样例输出
 * 3628800
 */
public class base30 {
    static final int MAX = 10000;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int[] A = new int[MAX + 1];
        for (int i = 0; i < A.length; i++) {
            A[i] = 0;
        }
        A[0] = 1;
        int r = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < MAX; j++) {
                int temp = A[j] * i + r;
                r = temp / 10;
                A[j] = temp % 10;
            }
        }

        int m = MAX;
        while (A[m--] == 0 && m >= 0) ;
        for (int i = m + 1; i >= 0; i--) {
            System.out.print(A[i]);
        }
    }
}
