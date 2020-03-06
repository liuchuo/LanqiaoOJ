package algorithm.Lanqiao.基础练习;

import java.util.Scanner;

/**
 * BASIC-21 基础练习 Sine之舞
 * 问题描述
 * 　　最近FJ为他的奶牛们开设了数学分析课，FJ知道若要学好这门课，必须有一个好的三角函数基本功。所以他准备和奶牛们做一个“Sine之舞”的游戏，
 * 寓教于乐，提高奶牛们的计算能力。
 * 　　不妨设
 * 　　An=sin(1–sin(2+sin(3–sin(4+...sin(n))...)
 * 　　Sn=(...(A1+n)A2+n-1)A3+...+2)An+1
 * 　　FJ想让奶牛们计算Sn的值，请你帮助FJ打印出Sn的完整表达式，以方便奶牛们做题。
 * 输入格式
 * 　　仅有一个数：N<201。
 * 输出格式
 * 　　请输出相应的表达式Sn，以一个换行符结束。输出中不得含有多余的空格或换行、回车符。
 * 样例输入
 * 3
 * 样例输出
 * ((sin(1)+3)sin(1–sin(2))+2)sin(1–sin(2+sin(3)))+1
 */

/**
 * 思路:
 A1=sin(1)
 A2=sin(1-sin(2))
 A3=sin(1-sin(2+sin(3)))
 S1=sin(1)+1;
 S2=(sin(1)+2)sin(1-sin(2))+1
 S3=((sin(1)+3)sin(1–sin(2))+2)sin(1–sin(2+sin(3)))+1
 那么可以有这个思路肯定要先求An,有n-1个左括号,然后An,然后输入右括号. */
public class base21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String[] an = new String[n];

        for (int i = 0; i < n; i++) {
            int temp = 1;
            String str = "";
            while (temp <= i + 1) {
                an[i] += "sin(" + temp;
                if (temp + 1 >= i + 2) {
                    str += ")";
                    break;
                }
                if (temp % 2 == 0) an[i] += "+";
                else if (i != 0) an[i] += "-";
                str += ")";
                temp++;
            }
            an[i] += str;
            an[i] = an[i].replace("null", "");
        }

        String s = "";
        for (int i = 0; i < n - 1; i++) {
            s += "(";
        }

        for (int i = 0; i < n; i++) {
            s += an[i] + "+" + (n - i);
            if (i != n - 1) {
                s += ")";
            }

        }
        System.out.println(s);
    }


}