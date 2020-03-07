/*
三羊献瑞

观察下面的加法算式：

      祥 瑞 生 辉
  +   三 羊 献 瑞
-------------------
   三 羊 生 瑞 气

(如果有对齐问题，可以参看【图1.jpg】)

其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。

请你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。

*/
/*
      a b c d
  +   e f g b
-------------------
    e f c b i

   e=1,a=9,f=0,c=b+1,c+g>10
   */
public class _03三羊献瑞 {
  public static void main(String[] args) {
    for (int b = 2; b < 9; ++b) {
      for (int d = 2; d < 9; ++d) {
        if (b == d) continue;
        for (int g = 2; g < 9; ++g) {
          if (g == b || g == d) continue;
          int c = b + 1;
          if (c == b || c == d || c == g) continue;
          if (c + g <= 10) continue;
/*
      a b c d
  +   e f g b
-------------------
    e f c b i
   e=1,a=9,f=0,c=b+1,c+g>10
   */
          int sum = 9000 + b * 100 + c * 10 + d + 1000 + g * 10 + b;
          for (int i = 2; i < 9; ++i) {
            if (i == b || i == d || i == g || i == c) continue;
            if (sum <= (10000 + c * 100 + b * 10 + i) && sum >= (10000 + c * 100 + b * 10 + i)) {
              System.out.printf("%2d%d%d%d\n", 9, b, c, d);
              System.out.printf("%2d%d%d%d\n", 1, 0, g, b);
              System.out.printf("%d\n", sum);
              System.out.printf("---------\n");
            }
          }

        }
      }
    }

  }
}
