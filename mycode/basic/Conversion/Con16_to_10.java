package basic.Conversion;
/*
        ��������
        �����Ӽ�������һ��������8λ������ʮ���������ַ���������ת��Ϊ����ʮ�������������
        ����ע��ʮ���������е�10~15�ֱ��ô�д��Ӣ����ĸA��B��C��D��E��F��ʾ��
        ��������
        FFFF
        �������
        65535
*
* */
import java.util.Scanner;

public class Con16_to_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hex = sc.next();

        System.out.println(Long.valueOf(hex,16));

    }
}
