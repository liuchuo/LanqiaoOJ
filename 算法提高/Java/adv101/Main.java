package adv101;

public class Main {

	// A 甲 B 乙 C 丙 D 丁
	public static void main(String[] args) {
		int cnt = 0;
		for (char c = 'A'; c <= 'D'; c++) {
			cnt = 0;
			if (c != 'B' && c == 'D') {
				cnt++;
			}
			
			if (c != 'B' && c == 'C') {
				cnt++;
			}
			
			if (c != 'A' && c == 'B') {
				cnt++;
			}
			
			if (c == 'D') {
				cnt++;
			}
			
			if (cnt == 4 || cnt == 0) {
				System.out.println(c);
			}
		}
	}

}
