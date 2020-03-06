package prev29;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long m = in.nextLong();
		BigInteger p = in.nextBigInteger();
		in.close();

		BigInteger f1 = new BigInteger("1");
		BigInteger f2 = new BigInteger("1");
		BigInteger fm = new BigInteger("1");
		for (long i = 3; i <= m; i++) {
			fm = f1.add(f2);
			f1 = f2;
			f2 = fm;
		}

		f1 = new BigInteger("1");
		f2 = new BigInteger("1");
		BigInteger sum = new BigInteger("2");
		BigInteger fn = new BigInteger("0");
		for (long i = 3; i <= n; i++) {
			fn = f1.add(f2);
			sum = sum.add(fn);
			f1 = f2;
			f2 = fn;
		}

		System.out.println(sum.mod(fm).mod(p));
	}

}
