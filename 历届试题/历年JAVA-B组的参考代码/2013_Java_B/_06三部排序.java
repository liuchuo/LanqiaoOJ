/*

标题：三部排序

    一般的排序有许多经典算法，如快速排序、希尔排序等。

    但实际应用时，经常会或多或少有一些特殊的要求。我们没必要套用那些经典算法，可以根据实际情况建立更好的解法。

    比如，对一个整型数组中的数字进行分类排序：

    使得负数都靠左端，正数都靠右端，0在中部。注意问题的特点是：负数区域和正数区域内并不要求有序。可以利用这个特点通过1次线性扫描就结束战斗!!

    以下的程序实现了该目标。

	static void sort(int[] x)
	{
		int p = 0;
		int left = 0;
		int right = x.length-1;

		while(p<=right){
			if(x[p]<0){
				int t = x[left];
				x[left] = x[p];
				x[p] = t;
				left++;
				p++;
			}
			else if(x[p]>0){
				int t = x[right];
				x[right] = x[p];
				x[p] = t;
				right--;
			}
			else{
				_________________________;  //代码填空位置
			}
		}
	}

   如果给定数组：
   25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0
   则排序后为：
   -3,-2,-16,-5,0,0,0,21,19,33,25,16,18,25



请分析代码逻辑，并推测划线处的代码，通过网页提交
注意：仅把缺少的代码作为答案，千万不要填写多余的代码、符号或说明文字！！




 */
// 负数都靠左端，正数都靠右端，0在中部
public class _06三部排序 {
  static void sort(int[] x) {
    int p = 0;
    int left = 0;//下标
    int right = x.length - 1;//最大下标

    while (p <= right) {
      if (x[p] < 0) {
        //元素小于0，将元素和left位置交换
        int t = x[left];
        x[left] = x[p];
        x[p] = t;

        left++;
        p++;
      } else if (x[p] > 0) {
        //元素大于0，将元素和right位置交换
        int t = x[right];
        x[right] = x[p];
        x[p] = t;

        right--;
      } else {//元素等于0
        // _________________________;  //代码填空位置
        p++;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = {25, 18, -2, 0, 16, -5, 33, 21, 0, 19, -16, 25, -3, 0};
    sort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
