package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base11 {
    public static void main(String[] args) {
        char[] str;
        long sum = 0;
        Scanner in = new Scanner(System.in);
        str = in.next().toCharArray();
        in.close();
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'F') {
                sum = sum * 16 + str[i] - 'A' + 10;
            } else {
                sum = sum * 16 + str[i] - '0';
            }
        }
        System.out.println(sum);
    }
}
