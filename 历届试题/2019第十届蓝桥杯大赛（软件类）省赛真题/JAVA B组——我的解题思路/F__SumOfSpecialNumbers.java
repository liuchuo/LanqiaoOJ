package provincial_2019;

/*
 * 1. �ҳ����а���2 0 1 9 �ĸ����ֵ���
 * 2. ��ͼ���
 * */

import java.util.Scanner;

public class F__SumOfSpecialNumbers {

    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (isExist(i)) {
                res += i;
            }
        }
        System.out.println(res);
    }

    private static boolean isExist(int n) {
            while (n != 0) {
                int tmp = n % 10;
                if (tmp == 2 || tmp == 0 || tmp == 1 || tmp == 9) {
                    return true;
                }
                n = n / 10;
            }
            return false;
    }
}
