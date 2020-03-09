/*
标题：奇怪的分式

    上小学的时候，小明经常自己发明新算法。一次，老师出的题目是：

    1/4 乘以 8/5

    小明居然把分子拼接在一起，分母拼接在一起，答案是：18/45 （参见图1.png）

    老师刚想批评他，转念一想，这个答案凑巧也对啊，真是见鬼！

    对于分子、分母都是 1~9 中的一位数的情况，还有哪些算式可以这样计算呢？

    请写出所有不同算式的个数（包括题中举例的）。

    显然，交换分子分母后，例如：4/1 乘以 5/8 是满足要求的，这算做不同的算式。

    但对于分子分母相同的情况，2/2 乘以 3/3 这样的类型太多了，不在计数之列!

注意：答案是个整数（考虑对称性，肯定是偶数）。请通过浏览器提交。不要书写多余的内容。*/
public class _06奇怪的分式 {
  private static int ans;

  public static void main(String[] args) {
    for (int a = 1; a < 10; a++) {
      for (int b = 1; b < 10; b++) {
        if (a == b) continue;

        for (int c = 1; c < 10; c++) {
          for (int d = 1; d < 10; d++) {
            if (c == d) continue;

            int gcd1 = gcd(a * c, b * d);
            int gcd2 = gcd(a * 10 + c, b * 10 + d);

            if (a * c / gcd1 == (a * 10 + c) / gcd2 && b * d / gcd1 == (b * 10 + d) / gcd2)
              ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }

  private static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}
