package algo10;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		TreeSet<Integer> treeSetA = new TreeSet<Integer>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			treeSetA.add(in.nextInt());
		}
		
		TreeSet<Integer> treeSetB = new TreeSet<Integer>();
		int m = in.nextInt();
		for (int i = 0; i < m; i++) {
			treeSetB.add(in.nextInt());
		}
		in.close();
		
		printDivide(treeSetA, treeSetB);
		printAdd(treeSetA, treeSetB);
		printRemain(treeSetA, treeSetB);
	}
	
	public static void printAdd(TreeSet<Integer> a, TreeSet<Integer> b) {
		a.addAll(b);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void printDivide(TreeSet<Integer> a, TreeSet<Integer> b) {
		
		@SuppressWarnings("unchecked")
		TreeSet<Integer> tempA = (TreeSet<Integer>) a.clone();
		a.removeAll(b);
		tempA.removeAll(a);
		for (int i : tempA) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void printRemain(TreeSet<Integer> a, TreeSet<Integer> b) {
		a.removeAll(b);
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}