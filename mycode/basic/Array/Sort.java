package basic.Array;


/*
    ��������
    ��������һ������Ϊn�����У���������а���С�����˳�����С�1<=n<=200
    �����ʽ
    ������һ��Ϊһ������n��
    �����ڶ��а���n��������Ϊ�����������ÿ�������ľ���ֵС��10000��
    �����ʽ
    �������һ�У�����С�����˳��������������С�
    ��������
    5
    8 3 6 4 9
    �������
    3 4 6 8 9
*
*/

import java.util.*;

public class Sort {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i=0; i<n;i++)
            nums[i] = sc.nextInt();

        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
    }
}
}
