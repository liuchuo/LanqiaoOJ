package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base12 {
    public static void main(String[] args) {
        char[] str;
        int[] des = new int[100];
        long sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        str = in.next().toCharArray();
        in.close();
        //16进制转换成10进制
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= 'A' && str[i] <= 'F') {
                sum = sum * 16 + str[i] - 'A' + 10;
            } else {
                sum = sum * 16 + str[i] - '0';
            }
        }
        int k = 0;
        //10进制转8进制
        while (sum > 0) {
            des[k++] = (int) (sum % 8);
            sum /= 8;
        }
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(des[i]);
        }

    }
}
