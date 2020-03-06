package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

/**
 * BASIC-29 基础练习 高精度加法
 * 问题描述
 * 　　输入两个整数a和b，输出这两个整数的和。a和b都不超过100位。
 * 算法描述
 * 　　由于a和b都比较大，所以不能直接使用语言中的标准数据类型来存储。对于这种问题，一般使用数组来处理。
 * 　　定义一个数组A，A[0]用于存储a的个位，A[1]用于存储a的十位，依此类推。同样可以用一个数组B来存储b。
 * 　　计算c = a + b的时候，首先将A[0]与B[0]相加，如果有进位产生，则把进位（即和的十位数）存入r，把和的个位数存入C[0]，即C[0]等于(A[0]+B[0])%10。然后计算A[1]与B[1]相加，这时还应将低位进上来的值r也加起来，即C[1]应该是A[1]、B[1]和r三个数的和．如果又有进位产生，则仍可将新的进位存入到r中，和的个位存到C[1]中。依此类推，即可求出C的所有位。
 * 　　最后将C输出即可。
 * 输入格式
 * 　　输入包括两行，第一行为一个非负整数a，第二行为一个非负整数b。两个整数都不超过100位，两数的最高位都不是0。
 * 输出格式
 * 　　输出一行，表示a + b的值。
 * 样例输入
 * 20100122201001221234567890
 * 2010012220100122
 * 样例输出
 * 20100122203011233454668012
 */
public class base29 {
    static final int MAX = 101;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] a = in.nextLine().toCharArray();
        char[] b = in.nextLine().toCharArray();
        in.close();
        int count = a.length > b.length ? b.length : a.length;
        int[] x = new int[MAX];
        int[] y = new int[MAX];
        int[] z = new int[MAX];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            x[j] = (a[i] - '0') > 0 ? a[i] - '0' : 0;
        }
        for (int i = b.length - 1, j = 0; i >= 0; i--, j++) {
            y[j] = (b[i] - '0') > 0 ? b[i] - '0' : 0;//不知道为什么会出现负数。。。。。
        }

       /* for (int t :
                x) {
            System.out.print(t);
        }
        System.out.println();
        for (int t :
                y) {
            System.out.print(t);
        }*/
        int r = 0;
        for (int i = 0; i < MAX; i++) {
            z[i] = x[i] + y[i] + r;
            r = z[i] / 10;
            z[i] %= 10;
        }
        //z[a.length>b.length?a.length:b.length]=r;
        r = MAX - 1;
        while (z[r] == 0) --r;
        while (r >= 0) {
            System.out.print(z[r]);
            r--;
        }


    }
}
