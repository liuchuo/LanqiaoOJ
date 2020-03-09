/*
抽签

X星球要派出一个5人组成的观察团前往W星。
其中：
A国最多可以派出4人。
B国最多可以派出2人。
C国最多可以派出2人。
....

那么最终派往W星的观察团会有多少种国别的不同组合呢？

下面的程序解决了这个问题。
数组a[] 中既是每个国家可以派出的最多的名额。
程序执行结果为：
DEFFF
CEFFF
CDFFF
CDEFF
CCFFF
CCEFF
CCDFF
CCDEF
BEFFF
BDFFF
BDEFF
BCFFF
BCEFF
BCDFF
BCDEF
....
(以下省略，总共101行)


public class A
{
	public static void f(int[] a, int k, int n, String s)
	{
		if(k==a.length){
			if(n==0) System.out.println(s);
			return;
		}

		String s2 = s;
		for(int i=0; i<=a[k]; i++){
			_____________________________;   //填空位置
			s2 += (char)(k+'A');
		}
	}

	public static void main(String[] args)
	{
		int[] a = {4,2,2,1,1,3};

		f(a,0,5,"");
	}
}


仔细阅读代码，填写划线部分缺少的内容。

注意：不要填写任何已有内容或说明性文字。
*/
public class _05_抽签 {
  private static int ans;

  public static void f(int[] a, int k, int n, String s)
  {
    if(k==a.length){
      if(n==0) {
        ans++;
        System.out.println(s);
      }
      return;
    }

    String s2 = s;
    for(int i=0; i<=a[k]; i++){
      f(a,k+1,n-i,s2);   //填空位置
      s2 += (char)(k+'A');
    }
  }

  public static void main(String[] args)
  {
    int[] a = {4,2,2,1,1,3};

    f(a,0,5,"");
    System.out.println(ans);
  }
}
