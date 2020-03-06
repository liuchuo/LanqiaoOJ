package basic.Conversion;
/*
    问题描述
    　　给定n个十六进制正整数，输出它们对应的八进制数。
    输入格式
    　　输入的第一行为一个正整数n （1<=n<=10）。
    　　接下来n行，每行一个由0~9、大写字母A~F组成的字符串，
        表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
    输出格式
    　　输出n行，每行为输入对应的八进制正整数。
    　　【注意】
    　　输入的十六进制数不会有前导0，比如012A。
    　　输出的八进制数也不能有前导0。
    样例输入
    　　2
    　　39
    　　123ABC
    样例输出
    　　71
    　　4435274
*
* */

import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class Con16_to_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String hex = sc.next();

        }
    }
}
