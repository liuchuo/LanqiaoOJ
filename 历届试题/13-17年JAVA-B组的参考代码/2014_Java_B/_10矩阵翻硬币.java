/*
标题：矩阵翻硬币

    小明先把硬币摆成了一个 n 行 m 列的矩阵。

    随后，小明对每一个硬币分别进行一次 Q 操作。

    对第x行第y列的硬币进行 Q 操作的定义：将所有第 i*x 行，第 j*y 列的硬币进行翻转。

    其中i和j为任意使操作可行的正整数，行号和列号都是从1开始。

    当小明对所有硬币都进行了一次 Q 操作后，他发现了一个奇迹——所有硬币均为正面朝上。

    小明想知道最开始有多少枚硬币是反面朝上的。于是，他向他的好朋友小M寻求帮助。

    聪明的小M告诉小明，只需要对所有硬币再进行一次Q操作，即可恢复到最开始的状态。然而小明很懒，不愿意照做。于是小明希望你给出他更好的方法。帮他计算出答案。

【数据格式】
    输入数据包含一行，两个正整数 n m，含义见题目描述。
    输出一个正整数，表示最开始有多少枚硬币是反面朝上的。

【样例输入】
2 3

【样例输出】
1

【数据规模】
对于10%的数据，n、m <= 10^3；
对于20%的数据，n、m <= 10^7；
对于40%的数据，n、m <= 10^15；
对于100%的数据，n、m <= 10^1000（10的1000次方）。

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 2000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。

*/

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

//第x行第y列被翻动的总次数？
//考虑第1行，第y列，y有多少真因子，就会被翻动多少次，而所有的y中，只有平方数的真因子个数为奇数（约数总是成对出现的）
//考虑第1列，第x行，x有多少真因子，就会被翻动多少次，而所有的x中，只有平方数的真因子个数为奇数
//x,y硬币被翻动的次数=x真因子个数*y真因子个数，只有奇数*奇数=奇数，所以，若要x,y为反面，必须x，y都是平方数
//因此，反面硬币总数=m中的平方数的个数*n中平方数的个数
//那么在m中有多少个平方数呢？答案是sqrt(m)向下取整个，如9内有三个平方数1，4，9；16里面有4个平方数1，4，9，16；25内有5个平方数
//因此此题等价于求sqrt(m)*sqrt(n)，那么怎么对一个很大的数开平方呢？
//假设一个数的长度为length，其平方根的长度为length/2（偶数）或者length/2+1(奇数)
//我们可以从高位不停地试探，每一个取平方后恰好不超过目标平方数的值
public class _10矩阵翻硬币 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    System.out.println(sqrt(s1).multiply(sqrt(s2)));
  }

  private static BigInteger sqrt(String s) {
    int length = s.length();
    int len = 0;
    if (length % 2 == 0)
      len = length / 2;
    else
      len = length / 2 + 1;
    char[] sArr = new char[len];
    Arrays.fill(sArr, '0');
    BigInteger target = new BigInteger(s);
    for (int pos = 0; pos < len; pos++) {
      for (char c = '1'; c <= '9'; c++) {
        sArr[pos] = c;//在pos这个位置上试着填入1-9
        BigInteger pow = new BigInteger(String.valueOf(sArr)).pow(2);//平方
        if (pow.compareTo(target) == 1)//试探数的平方更大
        {
          sArr[pos] -= 1;
          break;
        }
      }
    }
    return new BigInteger(String.valueOf(sArr));
  }
}
