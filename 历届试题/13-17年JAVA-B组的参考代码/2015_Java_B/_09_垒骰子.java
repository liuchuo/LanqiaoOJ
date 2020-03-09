import java.util.Scanner;

/*
垒骰子

赌圣atm晚年迷恋上了垒骰子，就是把骰子一个垒在另一个上边，不能歪歪扭扭，要垒成方柱体。
经过长期观察，atm 发现了稳定骰子的奥秘：有些数字的面贴着会互相排斥！
我们先来规范一下骰子：1 的对面是 4，2 的对面是 5，3 的对面是 6。
假设有 m 组互斥现象，每组中的那两个数字的面紧贴在一起，骰子就不能稳定的垒起来。 atm想计算一下有多少种不同的可能的垒骰子方式。
两种垒骰子方式相同，当且仅当这两种方式中对应高度的骰子的对应数字的朝向都相同。
由于方案数可能过多，请输出模 10^9 + 7 的结果。

不要小看了 atm 的骰子数量哦～

「输入格式」
第一行两个整数 n m
n表示骰子数目
接下来 m 行，每行两个整数 a b ，表示 a 和 b 不能紧贴在一起。

「输出格式」
一行一个数，表示答案模 10^9 + 7 的结果。

「样例输入」
2 1
1 2

「样例输出」
544

「数据范围」
对于 30% 的数据：n <= 5
对于 60% 的数据：n <= 100
对于 100% 的数据：0 < n <= 10^9, m <= 36

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 2000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。

*/
public class _09_垒骰子 {
  static int op[] = new int[7];
  private static int n;
  private static int m;
  private static final long MOD = 1000000007;

  static void init() {
    op[1] = 4;
    op[4] = 1;
    op[2] = 5;
    op[5] = 2;
    op[3] = 6;
    op[6] = 3;
  }

  public static void main(String[] args) {
    init();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    long conflict[][] = new long[6][6];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        conflict[i][j]=1;
      }
    }
    //建立冲突矩阵
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      conflict[op[a] - 1][b - 1] = 0;
      conflict[op[b] - 1][a - 1] = 0;
    }
    //  求冲突矩阵的n-1次方
    long[][] mPow_n_1 = mPow(conflict, n - 1);
    //累加矩阵的每个元素
    long ans = 0;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        ans = (ans + mPow_n_1[i][j]) % MOD;
      }
    }
    //ans*4^n
    System.out.println(ans * power(4, n) % MOD);
  }

  private static long power(long i, int n) {
    long ans = 1;
    while (n != 0) {
      if ((n & 1) == 1) ans = (ans * i) % MOD;
      i = i * i % MOD;
      n >>= 1;
    }
    return ans;
  }

  /*矩阵的快速幂*/
  private static long[][] mPow(long[][] conflict, int n) {
    long[][] e = new long[6][6];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (i == j) e[i][j] = 1;
        else e[i][j] = 0;
      }
    }
    while (n != 0) {
      if ((n & 1) == 1) {
        e = mMul(e, conflict);
      }
      conflict = mMul(conflict, conflict);
      n >>= 1;
    }

    return e;
  }

  private static long[][] mMul(long[][] a, long[][] b) {
    long[][] ans = new long[6][6];
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        for (int k = 0; k < 6; k++) {
          ans[i][j] = (ans[i][j] + a[i][k] * b[k][j]) % MOD;
        }
      }
    }
    return ans;
  }
}
