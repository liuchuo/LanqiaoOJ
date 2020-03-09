import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
标题：日期问题

小明正在整理一批历史文献。这些历史文献中出现了很多日期。小明知道这些日期都在1960年1月1日至2059年12月31日。令小明头疼的是，这些日期采用的格式非常不统一，有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。更加麻烦的是，年份也都省略了前两位，使得文献上的一个日期，存在很多可能的日期与其对应。

比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。

给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？

输入
----
一个日期，格式是"AA/BB/CC"。  (0 <= A, B, C <= 9)

输入
----
输出若干个不相同的日期，每个日期一行，格式是"yyyy-MM-dd"。多个日期按从早到晚排列。

样例输入
----
02/03/04

样例输出
----
2002-03-04
2004-02-03
2004-03-02

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
不要使用package语句。不要使用jdk1.7及以上版本的特性。
主类的名字必须是：Main，否则按无效代码处理。


*/
public class _07日期问题 {

  static boolean isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
  }


  static String f(int a, int b, int c) {
    if (a >= 0 && a <= 59)a += 2000;
    else if (a >= 60 && a <= 99)a += 1900;
    else return "";

    if (b < 1 || b > 12)return "";
    if (c < 1 || c > 31)return "";

    boolean _isLeap = isLeap(a);
    switch (b) {//日期校验
      case 2:
        if (_isLeap && c > 29)return "";
        if (!_isLeap && c > 28)return "";
        break;
      case 4:
        if (c > 30)return "";
        break;
      case 6:
        if (c > 30)return "";
        break;
      case 9:
        if (c > 30)return "";
        break;
      case 11:
        if (c > 30)return "";
        break;
      default:
        break;
    }
    String _a=a+"", _b=b+"", _c=c+"";

    if (_b.length() == 1)_b = "0" + _b;
    if (_c.length() == 1)_c = "0" + _c;

    return _a + "-" + _b + "-" + _c;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String in=sc.nextLine();

    int a = 0, b = 0, c = 0;
    a = (in.charAt(0) - '0') * 10 + (in.charAt(1)- '0');
    b = (in.charAt(3)- '0') * 10 + (in.charAt(4) - '0');
    c = (in.charAt(6) - '0') * 10 + (in.charAt(7) - '0');
    String case1 = f(a, b, c);
    String case2 = f(c, a, b);
    String case3 = f(c, b, a);
/*TreeSet带去重和排序功能*/
    Set<String> ans=new TreeSet<String>();
    if (case1 != "")ans.add(case1);
    if (case2 != "")ans.add(case2);
    if (case3 != "")ans.add(case3);
    for (String s:ans) {
      System.out.println(s);
    }
  }
}
