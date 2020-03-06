package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

import com.sun.glass.ui.TouchInputSupport;

/**
 * BASIC-19 基础练习 完美的代价
 * 问题描述
 * 　　回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，请你计算最少的交换次数使得该串变成一个完美的回文串。
 * 　　交换的定义是：交换两个相邻的字符
 * 　　例如mamad
 * 　　第一次交换 ad : mamda
 * 　　第二次交换 md : madma
 * 　　第三次交换 ma : madam (回文！完美！)
 * 输入格式
 * 　　第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
 * 　　第二行是一个字符串，长度为N.只包含小写字母
 * 输出格式
 * 　　如果可能，输出最少的交换次数。
 * 　　否则输出Impossible
 * 样例输入
 * 5
 * mamad
 * 样例输出
 * 3
 * 分析：过程见代码注释部分。其中有两个注意点：
 * 1.impossible的情况：如果有一个字符出现的次数是奇数次数，而且n是偶数，那么不可能构成回文
 * 如果n是奇数，但是已经有一个字符出现的次数是奇数次数了，那么如果又有一个字符是奇数次数，就不可能构成回文。
 * 2.如果n是奇数，计算中间那个字符交换的次数的时候，不需要模拟把这个数移动到中间去，因为移动到中间的话假设有一对数都在左边或者都在右边，
 * 那么交换成回文的时候就要经过中间，就会每次把cnt多加了1，而这个1是没有必要的，因为可以所有的回文移动完了之后再把这个独立的奇数移动过去，才能保证交换次数最少。
 *
 * @author cai 分析 liuchuo
 */
public class base19 {
    static char[] s;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        s = in.nextLine().toCharArray();
        in.close();
        int count = 0;
        int j = n - 1;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int k = j; k >= i; k--) {
                if (k == i) {//第i个字符为奇数个
                    if (n % 2 == 0 || flag) {//不能构成回文的两种情况
                        System.out.println("Impossible");
                        return;
                    }
                    flag = true;//遇到第一个奇数的字符,如果存在两个奇数的字符而且n为奇数不能构成回文
                    count += n / 2 - i;
                } else if (s[i] == s[k]) {
                    for (int l = k; l < j; l++) {
                        swap(l, l + 1);//把s[k]换到s[j]处
                        print();
                        count++;//统计交换次数
                    }
                    j--;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    private static void print() {
        for (char c : s) {
            System.out.print(c);
        }
        System.out.println();
    }

    private static void swap(int c, int d) {
        char temp = s[c];
        s[c] = s[d];
        s[d] = temp;

    }
}