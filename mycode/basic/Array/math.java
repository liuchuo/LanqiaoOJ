package basic.Array;



/*
  ��������
    ����n�������ҳ���n���������ֵ����Сֵ���͡�
  �����ʽ
    ��һ��Ϊ����n����ʾ���ĸ�����
    �ڶ�����n������Ϊ������n������ÿ�����ľ���ֵ��С��10000��
  �����ʽ
    ������У�ÿ��һ����������һ�б�ʾ��Щ���е����ֵ���ڶ��б�ʾ��Щ���е���Сֵ�������б�ʾ��Щ���ĺ͡�
  ��������
    5
    1 3 -2 4 5
  �������
    5
    -2
    11
  ���ݹ�ģ��Լ��
    1 <= n <= 10000��
*/

import java.util.Scanner;

public class math {
    public static void main(String args[]) {
        int max, min, sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        max = min = nums[0];

        for (int j = 0; j < nums.length; j++) {
            sum = sum + nums[j];
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > max) {
                max = nums[j];
            }
            if (nums[j] < min) {
                min = nums[j];
            }
        }


        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);

    }
}
