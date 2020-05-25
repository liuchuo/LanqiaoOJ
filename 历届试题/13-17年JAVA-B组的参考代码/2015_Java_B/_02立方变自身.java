/*
立方变自身

观察下面的现象,某个数字的立方，按位累加仍然等于自身。
1^3 = 1
8^3  = 512    5+1+2=8
17^3 = 4913   4+9+1+3=17
...

请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？

请填写该数字，不要填写任何多余的内容或说明性的文字。
*/
public class _02立方变自身 {
  private static int ans;

  public static void main(String[] args) {
    for (int i = 1; i <99 ; i++) {
      int i1 = i * i * i;
      int sum=sum(i1);
      if (sum==i){
        System.out.println(i+" "+i1);
        ans++;
      }
    }
    System.out.println(ans);
  }

  private static int sum(int x) {
    String s=String.valueOf(x);
    int sum=0;
    for (int i = 0; i < s.length(); i++) {
      sum+=s.charAt(i)-'0';
    }
    return sum;
  }
}//6
