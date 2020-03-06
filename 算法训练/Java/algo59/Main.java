package algo59;
// 自己写的快速排序在遇到一个极端情况，会出现超时
import java.io.*;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(reader.readLine());
		}
		reader.close();
//		quickSort();
		Arrays.sort(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
	private static int[] num;

//	private static void quickSort() {
//		quickSort(0, num.length - 1);
//	}
//	
//	private static void quickSort(int l, int r) {
//		if (l < r) {
//			int pivot = partion(l, r);
//			quickSort(l, pivot - 1);
//			quickSort(pivot + 1, r);
//		}
//	}
//	
//	private static int partion(int l, int r) {
//		swap(l, (l + r) / 2);
//		int pivot = l;		
//		while (true) {
//			while (l <= r && num[l] < num[pivot]) {
//				l++;
//			}
//			while (l <= r && num[r] > num[pivot]) {
//				r--;
//			}
//			
//			if (l < r) {
//				swap(l, r);
//				l++;
//				r--;
//			} else {
//				break;
//			}
//		}
//		swap(r, pivot);
//		return r;
//	}
//	
//	private static void swap(int i, int j) {
//		int temp = num[i];
//		num[i] = num[j];
//		num[j] = temp;
//	}
}
