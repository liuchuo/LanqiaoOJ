package prev29;

public class Test {

	public static void main(String[] args) {
		long f1 = 1;
		long f2 = 1;
		long fm = 1;
		for (int i = 0; i <= 12345; i++) {
			fm = (f1 % 1000000007 + f2 % 1000000007) % 1000000007;
			f1 = f2;
			f2 = fm;
		}
		System.out.println(fm);
	}

}
