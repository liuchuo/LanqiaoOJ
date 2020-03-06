package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base9 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();
        //5位的
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i * 2 + j * 2 + k == n) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.print(j);
                        System.out.print(i);
                        System.out.println();
                    }
                }
            }

        }
        //6位的
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i * 2 + j * 2 + k * 2 == n) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.print(k);
                        System.out.print(j);
                        System.out.print(i);
                        System.out.println();
                    }
                }
            }

        }
    }
}
