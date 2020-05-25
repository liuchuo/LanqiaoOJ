package adv172;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		IdNumber[] idNumbers = new IdNumber[n];
		for (int i = 0; i < n; i++) {
			idNumbers[i] = new IdNumber(bufferedReader.readLine());
		}
		bufferedReader.close();

		Arrays.sort(idNumbers);
		for (IdNumber idNumber : idNumbers) {
			System.out.println(idNumber);
		}
	}

}

class IdNumber implements Comparable<IdNumber> {

	private String num;
	private int year;
	private int month;
	private int day;

	public IdNumber(String num) {
		year = Integer.parseInt(num.substring(6, 10));
		month = Integer.parseInt(num.substring(10, 12));
		day = Integer.parseInt(num.substring(12, 14));
		this.num = num;
	}

	@Override
	public int compareTo(IdNumber idNumber) {
		if (year > idNumber.year) {
			return -1;
		} else if (year == idNumber.year) {
			if (month > idNumber.month) {
				return -1;
			} else if (month < idNumber.month) {
				if (day > idNumber.day) {
					return -1;
				} else if (day < idNumber.day) {
					return 1;
				} else {
					return -num.compareTo(idNumber.num);
				}
			} else {
				return 1;
			}
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return num;
	}

}