package algo142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] input = in.nextLine().split(" ");
		in.close();

		char op = input[0].charAt(0);
		Main out = new Main();
		Complex a = out.new Complex(input[1], input[2]);
		Complex b = out.new Complex(input[3], input[4]);

		switch (op) {
		case '+':
			System.out.print(a.add(b));
			break;
		case '-':
			System.out.print(a.subtract(b));
			break;
		case '*':
			System.out.print(a.multiply(b));
			break;
		case '/':
			System.out.print(a.divide(b));
			break;
		}
	}

	private class Complex {
		double shi;
		double xu;

		public Complex(String shi, String xu) {
			this.shi = Double.parseDouble(shi);
			this.xu = Double.parseDouble(xu);
		}

		public String add(Complex b) {
			return String.format("%.2f+%.2fi", this.shi + b.shi, this.xu + b.xu);
		}

		public String subtract(Complex b) {
			return String.format("%.2f+%.2fi", this.shi - b.shi, this.xu - b.xu);
		}

		public String multiply(Complex b) {
			return String.format("%.2f+%.2fi", this.shi * b.shi - this.xu * b.xu, this.shi * b.xu + this.xu * b.shi);
		}

		public String divide(Complex b) {
			return String.format("%.2f+%.2fi", (this.shi * b.shi + this.xu * b.xu) / (b.shi * b.shi + b.xu * b.xu),
					(this.xu * b.shi - this.shi * b.xu) / (b.shi * b.shi + b.xu * b.xu));
		}
	}
}
