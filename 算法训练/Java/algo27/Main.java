package algo27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		char[] s = reader.readLine().toCharArray();
		reader.close();
		fbi(s, n);
	}
	
	private static String fbi(char[] s,int n) {
		if (s.length == 1) {
			switch (s[0]) {
			case '1':
				System.out.print("I");
				return "I";
			case '0':
				System.out.print("B");
				return "B";
			default:
				break;
			}
		}
	
		char[] s1 = Arrays.copyOfRange(s, 0, s.length / 2);
		String left = fbi(s1,n);
		char[] s2 = Arrays.copyOfRange(s, s.length / 2, s.length);
		String right = fbi(s2, n);
		if (left.equals(right)) {
			System.out.print(left);
			return left;
		} else {
			System.out.print("F");
			return "F";
		}
	}
}
