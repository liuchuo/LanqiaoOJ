package algo129;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					if (10 - i - j - k >= 0) {
						System.out.println("" + i + j + k + (10 - i - j - k));
					}
				}
			}
		}
	}
}
