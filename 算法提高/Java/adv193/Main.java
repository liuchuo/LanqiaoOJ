package adv193;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<String> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(in.next());
		}
		for (int i = 0; i < m; i++) {
			String c = in.next();
			if (c.equals("DEL")) {
				String p = in.next();
				list.remove(p);
			} else if (c.equals("ADD")) {
				String p = in.next();
				String q = in.next();
				
				int site = list.indexOf(p);
				list.add(site, q);
			}
		}
		in.close();
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
