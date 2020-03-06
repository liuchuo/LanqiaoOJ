package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

//快速排序
public class base13 {
    public static void main(String[] args) {
        int[] nums = new int[200];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        in.close();
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        qickSort(nums, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

    //快速排序
    private static void qickSort(int[] a, int l, int h) {
        if (h > l) {
            int p = sort(a, l, h);
            qickSort(a, l, p - 1);
            qickSort(a, p + 1, h);
        }
    }

    private static int sort(int[] a, int l, int h) {
        int x = a[l], i = l, j = h + 1;
        while (true) {
            while (x > a[++i]) ;
            while (x < a[--j]) ;
            if (i > j) {
                break;
            }
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        a[l] = a[j];
        a[j] = x;
        return j;
    }

}