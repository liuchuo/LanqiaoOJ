package algorithm.Lanqiao.基础练习;

import java.util.Iterator;
import java.util.Scanner;

public class base4 {
    public static void main(String[] args) {
        int max, min, count;
        Scanner in = new Scanner(System.in);
        int i = 0;
        String str = in.nextLine();
        String[] strs = str.split(" ");
        int[] num = new int[strs.length];
        for (int j = 0; j < strs.length; j++) {
            num[j] = Integer.parseInt(strs[j]);
        }
        in.close();
        max = min = count = num[0];
        for (int j = 1; j < num.length; j++) {
            if (num[j] > max) {
                max = num[j];
            }
            if (num[j] < min) {
                min = num[j];
            }
            count += num[j];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
    }
}
