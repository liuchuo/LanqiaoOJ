import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
生命之树

在X森林里，上帝创建了生命之树。

他给每棵树的每个节点（叶子也称为一个节点）上，都标了一个整数，代表这个点的和谐值。
上帝要在这棵树内选出一个非空节点集S，使得对于S中的任意两个点a,b，都存在一个点列 {a, v1, v2, ..., vk, b} 使得这个点列中的每个点都是S里面的元素，且序列中相邻两个点间有一条边相连。

在这个前提下，上帝要使得S中的点所对应的整数的和尽量大。
这个最大的和就是上帝给生命之树的评分。

经过atm的努力，他已经知道了上帝给每棵树上每个节点上的整数。但是由于 atm 不擅长计算，他不知道怎样有效的求评分。他需要你为他写一个程序来计算一棵树的分数。

「输入格式」
第一行一个整数 n 表示这棵树有 n 个节点。
第二行 n 个整数，依次表示每个节点的评分。
接下来 n-1 行，每行 2 个整数 u, v，表示存在一条 u 到 v 的边。由于这是一棵树，所以是不存在环的。

「输出格式」
输出一行一个数，表示上帝给这棵树的分数。

「样例输入」
5
1 -2 -3 4 5
4 2
3 1
1 2
2 5

「样例输出」
8

「数据范围」
对于 30% 的数据，n <= 10
对于 100% 的数据，0 < n <= 10^5, 每个节点的评分的绝对值不超过 10^6 。

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 3000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。

*/
public class _10生命之树 {

  private static int n;
  private static long[] w;
  private static List<Integer>[] g;
  private static long ans ;

  public static void main(String[] args) throws FileNotFoundException {
    System.setIn(new FileInputStream(new File("/Users/zhengwei/workspace/lanqiaobei2019/src/2015_Java_B/data10/in5.txt")));
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    w = new long[n + 1];
    g = new ArrayList[n + 1];
    initG();
    for (int i = 1; i <= n; i++) {
      w[i] = sc.nextLong();
    }
    for (int i = 0; i < n - 1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      g[a].add(b);
      g[b].add(a);
    }
    dfs(1, 0);
    System.out.println(ans);
  }

  /**
   * u做为根所代表的子树有一个最大权和，将其存储在w[u]中
   * @param u
   * @param fa
   */
  private static void dfs(int u, int fa) {
    for (int i = 0; i < g[u].size(); i++) {
      Integer child = g[u].get(i);
      if (child == fa) continue;
      dfs(child, u);
      if (w[child] > 0)
        w[u] += w[child];
    }
    if (w[u] > ans) ans = w[u];
  }

  private static void initG() {
    for (int i = 0; i < n + 1; i++) {
      g[i] = new ArrayList<Integer>();
    }

  }
}
