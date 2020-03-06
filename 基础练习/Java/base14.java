package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base14 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        //输入秒
        long time = inScanner.nextLong();
        inScanner.close();
        int h = (int) (time / 3600);
        time %= 3600;
        int m = (int) (time / 60);
        int s = (int) (time % 60);
        System.out.println(h + ":" + m + ":" + s);

    }
}
