package basic.Palindrome;

/*
    * 问题描述
    　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
    　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
    输入格式
    　　输入一行，包含一个正整数n。
    输出格式
    　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
    样例输入
    52
    样例输出
    899998
    989989
    998899
* */

import java.util.Scanner;

public class special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                for (int k = 0; k < 10; k++)
                    if (i * 2 + j * 2 + k == n) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.print(j);
                        System.out.println(i);
                    }
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                for (int k = 0; k < 10; k++)
                    if (i * 2 + j * 2 + k * 2 == n) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.print(k);
                        System.out.print(j);
                        System.out.println(i);
                    }
    }
}
