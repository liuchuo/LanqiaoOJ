package adv209;

public class Main {

	public static void main(String[] args) {
		boolean[] prime = new boolean[101];
		setPrime(prime);
		for (int i = 2; i < prime.length; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}
	
	private static void setPrime (boolean[] prime) {
		for (int i = 1; i < prime.length; i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i < 100; i++) {
			for (int j = 2; i * j <= 100; j++) {
				prime[i * j] = false;
			}
		}
	}

}
