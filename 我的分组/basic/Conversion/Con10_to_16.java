package basic.Conversion;



/*
*问题描述
　　十六进制是在程序设计时经常要使用到的一种整数的表示方式。
*   它有0,1,2,数3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。
*   十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，
*   以此类推，十进制的30在十六进制中是1E。
　　给出一个非负整数，将它表示成十六进制的形式。
输入格式
　　输入包含一个非负整数a，表示要转换的数。0<=a<=2147483647
输出格式
　　输出这个整数的16进制表示
*
* 调用方法有：
*
* */
import java.util.Scanner;
public class Con10_to_16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Integer.toHexString(a).toUpperCase());
    }
}


