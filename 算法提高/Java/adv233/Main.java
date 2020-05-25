package adv233;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			int op = sc.nextInt();
			switch (op) {
			case 1:
				queue.add(sc.nextInt());
				break;
			case 2:
				if (queue.isEmpty()) {
					System.out.println("no");
					return ;
				} else {
					System.out.println(queue.poll());
				}
				break;
			case 3:
				System.out.println(queue.size());
				break;
			default:
				break;
			}
		}
		sc.close();
	}
}
