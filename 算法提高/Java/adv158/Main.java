package adv158;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean[] doc = new boolean[n+1];
		
		for (int i = 0; i < n; i++) {
			String str = in.next();
			
			if (str.equals("New")) {
				int index = firstEmptyDoc(doc);
				doc[index] = true;
				System.out.println(index);
			} else {
				int index = in.nextInt();
				if (doc[index] == false) {
					System.out.println("Failed");
				} else {
					System.out.println("Successful");
					doc[index] = false;
				}
			}
		}
		in.close();
	}

	public static int firstEmptyDoc(boolean[] doc) {
		
		for (int i = 1; i < doc.length; i++) {
			if (doc[i] == false) {
				return i;
			}
		}
		
		return doc.length;
	}
}
