package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base5 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int count = 0, num;
        count = inScanner.nextInt();
        int[] list = new int[count + 1];
        for (int i = 1; i <= count; i++) {
            list[i] = inScanner.nextInt();
        }
        num = inScanner.nextInt();
        inScanner.close();
        for (int i = 1; i <= list.length; i++) {
            if (num == list[i]) {
                System.out.println(i);
                break;
            }
            if (i == count) {
                System.out.println(-1);
            }
        }

    }
}
