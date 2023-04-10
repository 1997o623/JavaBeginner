package tw.com.ispan.first;

import java.util.Scanner;

public class a11test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("YEAR = ");
		int year = scanner.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.printf("%d年為閏年", year);
				} else {
					System.out.printf("%d年為平年", year);
				}
			} else {
				System.out.printf("%d年為閏年", year);
			}
		} else
			System.out.printf("%d年為平年", year);
	}
}
