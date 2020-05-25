package basic.Palindrome;
/*
  问题描述
       1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
  输出格式
       按从小到大的顺序输出满足条件的四位十进制数。

*/

import java.util.Scanner;

public class Normal {
    public static void main(String args[]) {
        for (int i = 1000; i < 9999; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPalindrome(int n) {
        int s = 0;
        int p = 0;
        while (n > 0) {
            s = s * 10 + n % 10;
            n /= 10;
        }
        return s == p;
    }
}

