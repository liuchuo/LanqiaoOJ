package adv198;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] password = in.nextLine().split(" ");
		String[] pattern = in.nextLine().split(" ");
		in.close();

		List<String> list = new ArrayList<>();
		for (String string : pattern) {
			String ans = march(string, password);
			if (!ans.equals("")) {
				list.add(ans);
			}
		}
		
		Collections.sort(list);
		for(String string : list) {
			System.out.print(string + " ");
		}
	}

	private static String march(String string, String[] password) {
		for (String s : password) {
			char[] cn = string.toCharArray();
			char[] cd = s.toCharArray();

			Arrays.sort(cn);
			Arrays.sort(cd);
			if (new String(cn).equals(new String(cd))) {
				return s;
			}
		}
		return "";
	}

}
