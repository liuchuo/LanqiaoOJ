import java.util.HashSet;
import java.util.Set;

/*
标题：魔方状态

二阶魔方就是只有2层的魔方，只由8个小块组成。
如图p1.png所示。

小明很淘气，他只喜欢3种颜色，所有把家里的二阶魔方重新涂了颜色，如下：

前面：橙色
右面：绿色
上面：黄色
左面：绿色
下面：橙色
后面：黄色

请你计算一下，这样的魔方被打乱后，一共有多少种不同的状态。

如果两个状态经过魔方的整体旋转后，各个面的颜色都一致，则认为是同一状态。

请提交表示状态数的整数，不要填写任何多余内容或说明文字。
*/
public class _04魔方状态 {

  static char[][] start = {"oybbgb".toCharArray(),
      "oygbbb".toCharArray(),
      "bygbby".toCharArray(),
      "bybbgy".toCharArray(),
      "obbogb".toCharArray(),
      "obgobb".toCharArray(),
      "bbgoby".toCharArray(),
      "bbbogy".toCharArray()};
  static char[][][] q = new char[2000000][8][6];
  static Set<String> all_state = new HashSet<String>();
  static int  front, tail;


  static String to_string(char[][] a) {
    String ans = "";
    for (int i = 0; i < 8; ++i) {
      ans += new String(a[i]);
    }
    return ans;
  }

  private static void swap(char[] a, int i, int j) {
    char t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  private static void swap(char[][] a, int i, int j) {
    char[] t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  //上层的块的旋转，面的相对位置调换
  static void ucell(char[] a) {
    swap(a, 0, 2);
    swap(a, 2, 5);
    swap(a, 5, 4);
  }


  //上层顺时针旋转
  static void u(char[][] s) {
    ucell(s[0]);
    ucell(s[1]);
    ucell(s[2]);
    ucell(s[3]);
//    块的相对位置调换
    swap(s, 1, 0);
    swap(s, 2, 1);
    swap(s, 3, 2);

  }

  //右层旋转是面的位置变化
  static void rcell(char[] a) {
    swap(a, 1, 0);
    swap(a, 0, 3);
    swap(a, 3, 5);
  }

  static void r(char[][] s)//魔方右层顺时针转
  {
    rcell(s[1]);
    rcell(s[2]);
    rcell(s[6]);
    rcell(s[5]);
//    块的位置变化
    swap(s, 2, 1);
    swap(s, 5, 1);
    swap(s, 6, 5);
  }

  static void fcell(char[] a) {
    swap(a, 2, 1);
    swap(a, 1, 4);
    swap(a, 4, 3);
  }

  static void f(char[][] s)//前面一层 顺时针转
  {
    fcell(s[0]);
    fcell(s[1]);
    fcell(s[4]);
    fcell(s[5]);
    swap(s, 1, 5);
    swap(s, 0, 1);
    swap(s, 4, 0);
  }

  static void uwhole(char[][] s)//整个魔方从顶部看 顺时针转 用于判重
  {
    u(s);//上层旋转
//    下层旋转
    ucell(s[4]);
    ucell(s[5]);
    ucell(s[6]);
    ucell(s[7]);
//    完成自旋后，块的位置变动
    swap(s, 5, 4);
    swap(s, 6, 5);
    swap(s, 7, 6);
  }

  static void fwhole(char[][] s)//整个魔方从前面看 顺时针转 用于判重
  {
    f(s);
    fcell(s[2]);
    fcell(s[6]);
    fcell(s[7]);
    fcell(s[3]);
    swap(s, 2, 6);
    swap(s, 3, 2);
    swap(s, 7, 3);
  }

  static void rwhole(char[][] s)//整个魔方从右边看 顺时针转 用于判重
  {
    r(s);
    rcell(s[0]);
    rcell(s[3]);
    rcell(s[4]);
    rcell(s[7]);
    swap(s, 3, 7);
    swap(s, 0, 3);
    swap(s, 4, 0);
  }


  static boolean try_insert(char[][] s) {
    char[][] k = new char[8][6];
    memcpy(k, s);
    for (int i = 0; i < 4; i++) {
      fwhole(k);
      for (int j = 0; j < 4; j++) {
        uwhole(k);
        for (int q = 0; q < 4; q++) {
          rwhole(k);
          if (all_state.contains(to_string(k))) {
            return false;
          }
        }
      }
    }
    all_state.add(to_string(k));
    return true;

  }

  private static void memcpy(char[][] k, char[][] s) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 6; j++) {
        k[i][j] = s[i][j];
      }
    }
  }

  static void solve() {
    front = 0;
    tail = 1;
    all_state.add(to_string(start));
    memcpy(q[front], start);//填充q[0]，相当于第一个状态入队列
    while (front < tail) {
        /*将其所有变形，尝试加入set中*/
      memcpy(q[tail], q[front]);//拷贝到tail
      u(q[tail]);//上层顺时针旋转
      if (try_insert(q[tail])) {
        tail++;//扩展队列
      }
      memcpy(q[tail], q[front]);//拷贝到tail
      r(q[tail]);//右层顺时针旋转
      if (try_insert(q[tail])) {
        tail++;//扩展队列
      }
      memcpy(q[tail], q[front]);//拷贝到tail
      f(q[tail]);//前顺时针旋转
      if (try_insert(q[tail])) {
        tail++;//扩展队列
      }
      front++;//弹出队首
//        cout << front << " " << tail << endl;
    }

    System.out.println(front);
  }

  public static void main(String[] args) {
    solve();
  }
}