package basic.Palindrome;

/*
    * ��������
    ����123321��һ���ǳ����������������߶��ʹ��ұ߶���һ���ġ�
    ��������һ��������n�� �����������������λ����λʮ�������������λ����֮�͵���n ��
    �����ʽ
    ��������һ�У�����һ��������n��
    �����ʽ
    ��������С�����˳���������������������ÿ������ռһ�С�
    ��������
    52
    �������
    899998
    989989
    998899
* */

import java.util.Scanner;

public class special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                for (int k = 0; k < 10; k++)
                    if (i * 2 + j * 2 + k == n) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.print(j);
                        System.out.println(i);
                    }
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                for (int k = 0; k < 10; k++)
                    if (i * 2 + j * 2 + k * 2 == n) {
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.print(k);
                        System.out.print(j);
                        System.out.println(i);
                    }
    }
}
