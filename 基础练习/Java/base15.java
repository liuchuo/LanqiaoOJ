package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] a = in.nextLine().toCharArray();
        char[] b = in.nextLine().toCharArray();
        in.close();
        boolean flag = false;
        int i = 0;
        if (a.length == b.length) {
            for (; i < b.length; i++) {
                if (a[i] == b[i]) {
                    continue;
                } else if (Math.abs(a[i] - b[i]) == 32) {
                    flag = true;
                } else {
                    break;
                }
            }
        } else {
            System.out.println(1);
            return;
        }


        if (flag && i == b.length) {
            System.out.println(3);
        } else if (!flag && i == b.length) {
            System.out.println(2);
        } else {
            System.out.println(4);
        }
    }

}
