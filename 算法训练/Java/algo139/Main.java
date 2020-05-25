package algo139;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		int n = inScanner.nextInt();
		inScanner.close();
	
		String string = new String("0");
		for (int i = 0; i < n; i++) {
			String tmp = "";
			for (int j = 0; j < string.length(); j++) {
				char c = string.charAt(j);
				if (c == '0') {
					tmp += '1';
				} else {
					tmp += "01";
				}
			}
			string = tmp;
		}
		
		System.out.println(string);
	}
}
