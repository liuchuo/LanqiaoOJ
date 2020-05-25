package basic.Palindrome;
/*
  ��������
       1221��һ���ǳ����������������߶��ʹ��ұ߶���һ���ģ������������������λʮ��������
  �����ʽ
       ����С�����˳�����������������λʮ��������

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

