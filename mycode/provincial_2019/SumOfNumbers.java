package provincial_2019;

/*
 * S(n) = S(n-1)+S(n-2)+S(n-3)
 * 这道题是Fibonacci Sequence的变形题
 * 题目要求最后四位，所以我们迭代时只取最后四位就行
 * */
public class SumOfNumbers {
    public static void main(String[] args) {
        
    }
}

/*
        int n = 0;
        int[] sum = new int[n];
        if (n == 1 || n == 2 || n == 3) {
            System.out.printf("1");
        }
        for (int i = 4; i <= 20190324; i++) {
            sum[i] = (sum[i - 1] + sum[i - 2] + sum[i - 3]) % 100000;
        }
    }
}
这样写数组会溢出
*/

