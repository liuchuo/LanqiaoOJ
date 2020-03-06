package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

/**
 * BASIC-27 基础练习 2n皇后问题
 * 问题描述
 * 　　给定一个n*n的棋盘，棋盘中有一些位置不能放皇后。现在要向棋盘中放入n个黑皇后和n个白皇后，
 * 使任意的两个黑皇后都不在同一行、同一列或同一条对角线上，
 * 任意的两个白皇后都不在同一行、同一列或同一条对角线上。问总共有多少种放法？n小于等于8。
 * 输入格式
 * 　　输入的第一行为一个整数n，表示棋盘的大小。
 * 　　接下来n行，每行n个0或1的整数，如果一个整数为1，表示对应的位置可以放皇后，如果一个整数为0，表示对应的位置不可以放皇后。
 * 输出格式
 * 　　输出一个整数，表示总共有多少种放法。
 * 样例输入
 * 4
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 样例输出
 * 2
 * 样例输入
 * 4
 * 1 0 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 1 1 1 1
 * 样例输出
 * 0
 * 1、基本解题思路是递归回溯。一个白皇后和一个黑皇后看成是一组，给一个白皇后找到位置后，
 * 立刻给对应的黑皇后找位置，一组皇后中任何一个找不到位置就回溯。
 * 2、有了基本的解题思路，接下来要考虑的问题就是判断矩阵中 ( i , j ) 位置能否放皇后：
 * 我们利用的两个一维数组 w_place 和 b_place 来记录第 i 个白皇后所在的位置 ( i , w_place[ i ] )
 * 和第 i 个黑皇后所在的位置 ( i , b_place[ i ] ) ，这样自然而然的就消除了行冲突，
 * 因为一位数组的下标就是行标；列冲突可以通过 w_place[ i ] ( b_place[ i ] ) 和列标 j 比较判定；
 * 对角线有这么一个规律，假设两个位置 ( a , b ) ( c , d ) ，如果它们在某一对角线上，
 * 它们将会满足 abs( a - c ) = abs( b - d ) ，利用这点也可以轻而易举的解决对角线冲突。
 */
public class base27 {
    static int count = 0;
    static int n;
    static int[] w_place;
    static int[] b_place;
    static int[][] a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[n][n];
        w_place = new int[n];
        b_place = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        backTrace(0);
        //双回溯

        System.out.println(count);
    }

    private static void backTrace(int i) {//m为从上到下递增的行数 w为左到右的列
        if (i > n - 1) {
            count++;
            return;
        }
        for (int w = 0; w < n; w++) {
            if (check_w(i, w)) {
                w_place[i] = w;
                a[i][w] = 0;
                for (int b = 0; b < n; b++) {
                    if (check_b(i, b)) {
                        b_place[i] = b;
                        a[i][b] = 0;
                        backTrace(i + 1);
                        a[i][b] = 1;
                    }

                }
                a[i][w] = 1;
            }
        }

    }

    private static boolean check_w(int i, int j) {
        if (a[i][j] == 0)
            return false;
        for (int k = 0; k < i; k++) {
            if (w_place[k] == j || Math.abs(i - k) == Math.abs(w_place[k] - j))
                return false;
        }
        return true;
    }

    private static boolean check_b(int i, int j) {
        if (a[i][j] == 0)
            return false;
        for (int k = 0; k < i; k++) {
            if (b_place[k] == j || Math.abs(i - k) == Math.abs(b_place[k] - j))
                return false;
        }
        return true;
    }
}
