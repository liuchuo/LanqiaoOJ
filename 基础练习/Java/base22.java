package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

public class base22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(dfs(n));

    }

    public static String dfs(int n) {
        if (n == 1) {
            return "A";
        }
        return dfs(n - 1) + (char) (n - 1 + 'A') + dfs(n - 1);
    }
}
