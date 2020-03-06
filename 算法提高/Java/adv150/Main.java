package adv150;

//error.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String string = in.nextLine();
		in.close();

		for (int i = 1; i < string.length(); i++) {
			boolean isTrue = true;
			if (string.length() % i == 0) {

				for (int j = i; j < string.length(); j += i) {
					if (!string.substring(0, i).equals(string.substring(j, j + i))) {
						isTrue = false;
						break;
					}
				}
			} else {
				isTrue = false;
			}
			
			if (isTrue) {
				System.out.println(i);
				return;
			}
		}
		
		System.out.println(string.length());

	}
}
