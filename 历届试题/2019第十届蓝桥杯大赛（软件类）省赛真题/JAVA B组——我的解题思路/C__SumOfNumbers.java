package provincial_2019;

/*
 * S(n) = S(n-1)+S(n-2)+S(n-3)
 * �������Fibonacci Sequence�ı�����
 * ��ĿҪ�������λ���������ǵ���ʱֻȡ�����λ����
 * */
class C__SumOfNumbers {
    public static void main(String[] args) {
        int[] sum = new int[20190330];
        int res = 0;
        sum[0]=sum[1]=sum[2]=1;
        for (int i = 3; i < 20190324; i++) {
            sum[i] = (sum[i - 1] + sum[i - 2] + sum[i - 3]) % 10000;
        }
        res =  sum[20190324];
        System.out.println(res);
    }
}




