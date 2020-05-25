package provincial_2017;/*
标题：纸牌三角形

A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
下图就是一种排法（如有对齐问题，参看p1.png）。

      A
     9 6
    4   8
   3 7 5 2

这样的排法可能会有很多。

如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

请你计算并提交该数字。

注意：需要提交的是一个整数，不要提交任何多余内容。



*/
/*
 * 思路：
 *   这是一个全排列的题,[1-9]的排列，每次从其中选出4个数字为一组，三组和相同。
 *   根据题目提示，旋转（3种） 镜像（2种），故最后结果要除以6种
 * 补充：
 *   排列，就是指从给定个数的元素中取出指定个数的元素进行排序。
 *   从n个不同元素中任取m（m≤n）个元素，按照一定的顺序排列起来，叫做从n个不同元素中取出m个元素的一个排列。
 *   当m=n时所有的排列情况叫全排列。
 *   组合则是指从给定个数的元素中仅仅取出指定个数的元素，不考虑排序
 * */

public class playingcard_triangle {
    static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int ans;

    static void f(int k) {
        if (k == 9) {
            int x1 = a[0] + a[1] + a[3] + a[5];
            int x2 = a[0] + a[2] + a[4] + a[8];
            int x3 = a[5] + a[6] + a[7] + a[8];
            if (x1 == x2 && x2 == x3)
                ans++;
        }
        for (int i = k; i < 9; i++) {
            int t = a[k];
            a[k] = a[i];
            a[i] = t;
            f(k + 1);
            t = a[k];
            a[k] = a[i];
            a[i] = t;
        }
    }

    public static void main(String[] args) {
        f(0);
        System.out.println(ans/6);
    }
}

