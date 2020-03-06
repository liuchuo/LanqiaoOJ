package algorithm.Lanqiao.基础练习;

import java.util.Scanner;
/**
 * BASIC-20 基础练习 数的读法 问题描述
 * Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
 * 比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。 所以，他迫切地需要一个系统，然后当他输入12 3456
 * 7009时，会给出相应的念法： 十二亿三千四百五十六万七千零九 用汉语拼音表示为 shi er yi san qian si bai wu shi liu
 * wan qi qian ling jiu 这样他只需要照着念就可以了。
 * 你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，相邻的两个音节用一个空格符格开。
 * 注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling
 * shi”，“100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
 * 输入格式 有一个数字串，数值大小不超过2,000,000,000。 输出格式 是一个由小写英文字母，逗号和空格组成的字符串，表示该数的英文读法。 样例输入
 * 1234567009 样例输出 shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 * 参考http://blog.csdn.net/kaishihaohaozuoshi/article/details/53841446
 *
 * @author cai
 */
public class base20 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String[] c = {"ling ", "yi ", "er ", "san ", "si ", "wu ", "liu ", "qi ", "ba ", "jiu "};
        String[] d = {"", "shi ", "bai ", "qian ", "wan ", "shi ", "bai ", "qian ", "yi ", "shi ", "bai "};
        String ss = n + "";
        String buffer = new String();
        boolean b = true;
        int i, j;
        // 第一次出现零
        for (i = 0; i < ss.length(); i++) {
            for (j = 0; j <= 9; j++)
                if (ss.charAt(i) == j + '0')
                    break;
            if ((ss.length() + 2) % 4 == 0 && i == 0 && j == 1) {
                buffer += d[ss.length() - i - 1];
            } else if (i != ss.length() - 1 && j == 0) {
                if (b) {
                    buffer += c[j];
                    b = false;
                }
            } else if (i == ss.length() - 1 && j == 0) {
                if (!b)
                    buffer = buffer.substring(0, buffer.length() - 5);// 如果最后一个也为0，则去掉之前添加的
                // ling
            } else {
                buffer += c[j] + d[ss.length() - i - 1];
                b = true;
            }
        }
        System.out.println(buffer);
    }
}
