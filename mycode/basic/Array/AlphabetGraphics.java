package basic.Array;
/*
    *��������
    ������ĸ�������һЩ������ͼ�Σ����������һ�����ӣ�
    ABCDEFG
    BABCDEF
    CBABCDE
    DCBABCD
    EDCBABC
    ����һ��5��7�е�ͼ�Σ����ҳ����ͼ�εĹ��ɣ������һ��n��m�е�ͼ�Ρ�
    �����ʽ
    ����һ�У�������������n��m���ֱ��ʾ��Ҫ�����ͼ�ε�������������
    �����ʽ
    ���n�У�ÿ��m���ַ���Ϊ���ͼ�Ρ�
    ��������
    5 7
    �������
    ABCDEFG
    BABCDEF
    CBABCDE
    DCBABCD
    EDCBABC
*
* �к��ж���һ����ȥ��(Char)('A'
* */

import java.util.Scanner;

public class AlphabetGraphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print((char) ('A' + Math.abs(i - j)));
            }
            System.out.println();


        }
    }
}
