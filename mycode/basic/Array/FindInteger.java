package basic.Array;



/*
    * ��������
    ����һ������n�����������У�������a�������еĵ�һ�γ����ǵڼ�����
    �����ʽ
    ��һ�а���һ������n��
    �ڶ��а���n���Ǹ�������Ϊ���������У������е�ÿ������������10000��
    �����а���һ������a��Ϊ�����ҵ�����
    �����ʽ
    ���a�������г����ˣ��������һ�γ��ֵ�λ��(λ�ô�1��ʼ���)���������-1��
    ��������
    6
    1 9 4 8 3 9
    9
    �������
    2
* */
import java.util.Scanner;
public class FindInteger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int c = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == a) {
                c = i+1;
                break;
            }
        }
        System.out.println(c);
    }

}
