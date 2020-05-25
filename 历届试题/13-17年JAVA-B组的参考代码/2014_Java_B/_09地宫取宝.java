import java.util.Scanner;

/*
标题：地宫取宝

    X 国王有一个地宫宝库。是 n x m 个格子的矩阵。每个格子放一件宝贝。每个宝贝贴着价值标签。

    地宫的入口在左上角，出口在右下角。

    小明被带到地宫的入口，国王要求他只能向右或向下行走。

    走过某个格子时，如果那个格子中的宝贝价值比小明手中任意宝贝价值都大，小明就可以拿起它（当然，也可以不拿）。

    当小明走到出口时，如果他手中的宝贝恰好是k件，则这些宝贝就可以送给小明。

    请你帮小明算一算，在给定的局面下，他有多少种不同的行动方案能获得这k件宝贝。

【数据格式】

    输入一行3个整数，用空格分开：n m k (1<=n,m<=50, 1<=k<=12)

    接下来有 n 行数据，每行有 m 个整数 Ci (0<=Ci<=12)代表这个格子上的宝物的价值

    要求输出一个整数，表示正好取k个宝贝的行动方案数。该数字可能很大，输出它对 1000000007 取模的结果。

例如，输入：
2 2 2
1 2
2 1
程序应该输出：
2

再例如，输入：
2 3 2
1 2 3
2 1 5
程序应该输出：
14

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 2000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。
*/
public class _09地宫取宝 {
  private static final int MOD = 1000000007;
  static int[][] data;
  private static int n;
  private static int m;
  private static int k;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    k = sc.nextInt();
    data = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        data[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < 51; i++) {
      for (int j = 0; j < 51; j++) {
        for (int l = 0; l < 14; l++) {
          for (int o = 0; o < 14; o++) {
            cache[i][j][l][o] = -1;
          }
        }
      }
    }
    long ans = dfs(0, 0, -1, 0);
    System.out.println(ans);
  }

  static long[][][][] cache = new long[51][51][14][14];

  private static long dfs(int x, int y, int max, int cnt) {
    if (cache[x][y][max + 1][cnt] != -1) return cache[x][y][max + 1][cnt];
    if (x == n || y == m || cnt > k) return 0;
    int cur = data[x][y];
    int ans = 0;
    if (x == n - 1 && y == m - 1) {
      if (cnt == k || (cnt == k - 1 && cur > max)) return 1;
      return ans;
    }

    if (cur > max) {
      ans += dfs(x, y + 1, cur, cnt + 1);
      ans += dfs(x + 1, y, cur, cnt + 1);
    }
    ans += dfs(x, y + 1, max, cnt);
    ans += dfs(x + 1, y, max, cnt);
    cache[x][y][max + 1][cnt] = ans % MOD;
    return ans;
  }
}
