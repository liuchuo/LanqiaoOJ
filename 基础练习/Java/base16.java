package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        for (int i = a; i <= b; i++) {
            int temp = i;
            System.out.print(temp + "=");
            boolean flag = false;
            while (temp != 1) {
                //每次从小到大找，找到一个就求除数，然后重新开始找
                for (int j = 2; j <= temp; j++) {
                    if (isPrimer(j) && temp % j == 0) {
                        temp /= j;
                        if (flag) {
                            System.out.print("*");
                        }
                        System.out.print(j);
                        flag = true;
                        //break;
                    }

                }

            }
            System.out.println();
        }
    }

    //判断素数
    private static boolean isPrimer(int j) {
        if (j == 0) {
            return false;
        } else if (j == 2 || j == 3) {
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(j * j); i++) {
                if (j % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
