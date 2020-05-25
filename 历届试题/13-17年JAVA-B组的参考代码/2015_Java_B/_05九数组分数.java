
/*
九数组分数

    1,2,3...9 这九个数字组成一个分数，其值恰好为1/3，如何组法？

    下面的程序实现了该功能，请填写划线部分缺失的代码。

public class A
{
  public static void test(int[] x)
  {
    int a = x[0]*1000 + x[1]*100 + x[2]*10 + x[3];
    int b = x[4]*10000 + x[5]*1000 + x[6]*100 + x[7]*10 + x[8];
    if(a*3==b) System.out.println(a + " " + b);
  }

  public static void f(int[] x, int k)
  {
    if(k>=x.length){
      test(x);
      return;
    }

    for(int i=k; i<x.length; i++){
      {int t=x[k]; x[k]=x[i]; x[i]=t;}
      f(x,k+1);
      _______________________________________       // 填空
    }
  }

  public static void main(String[] args)
  {
    int[] x = {1,2,3,4,5,6,7,8,9};
    f(x,0);
  }
}

注意，只能填写缺少的部分，不要重复抄写已有代码。不要填写任何多余的文字。

*/

public class _05九数组分数 {
  public static void test(int[] x)
  {
    int a = x[0]*1000 + x[1]*100 + x[2]*10 + x[3];
    int b = x[4]*10000 + x[5]*1000 + x[6]*100 + x[7]*10 + x[8];
    if(a*3==b) System.out.println(a + " " + b);
  }

  public static void f(int[] x, int k)
  {
    if(k>=x.length){
      test(x);
      return;
    }

    for(int i=k; i<x.length; i++){
      {int t=x[k]; x[k]=x[i]; x[i]=t;}
      f(x,k+1);
      {int t=x[k]; x[k]=x[i]; x[i]=t;}      // 填空
    }
  }

  public static void main(String[] args)
  {
    int[] x = {1,2,3,4,5,6,7,8,9};
    f(x,0);
  }
}
