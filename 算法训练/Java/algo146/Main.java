package algo146;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (i % 11 == 0 && i % 17 == 0) {
				System.out.println(i);
			}
		}
	}
}
