package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base10 {
    public static void main(String[] args) {
        Long n;
        char[] a = new char[100];
        int i = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextLong();
        in.close();
        if (n == 0) {
            System.out.println(0);
        } else {
            while (n != 0) {
                if (n % 16 >= 10) {
                    a[i++] = (char) ('A' + n % 16 - 10);
                } else {
                    a[i++] = (char) ('0' + n % 16);
                }
                n /= 16;
            }
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }
    }
}
