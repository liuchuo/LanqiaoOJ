package algo115;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		isVisited = new boolean[n];
		nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		t = sc.nextInt();
		sc.close();
		dfs(n - 1, 0, new LinkedList<Integer>(), true);
		while (!out.isEmpty()) {
			System.out.println(out.pop());
		}
		System.out.println(cnt);
	}
	
	private static int cnt = 0, n = 0, t = 0;
	private static boolean[] isVisited;
	private static int[] nums;
	private static Stack<String> out = new Stack<>();
	
	private static void dfs(int pos, int tempT, LinkedList<Integer> selectedNums, boolean isNone) {
		for (int i = pos; i >= 0; i--) {
			if (!isVisited[i]) {
				isVisited[i] = true;
				selectedNums.push(nums[i]);
				dfs(i - 1, tempT + nums[i], selectedNums, false);
				selectedNums.pop();
				isVisited[i] = false;
			}
		}
		if (tempT == t && !isNone) {
			out.push(toReulstString(selectedNums.iterator()));
			cnt++;
		}
	}
	
	private static String toReulstString(Iterator<Integer> it) {
		StringBuilder result = new StringBuilder();
		while (it.hasNext()) {
			result.append(it.next() + " ");
		}
		return result.toString();
	}
}
