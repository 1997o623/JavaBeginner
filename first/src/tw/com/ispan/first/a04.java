package tw.com.ispan.first;

import java.util.Scanner;

public class a04 {

	public static void main(String[] args) {
		// 輸入
		Scanner scan = new Scanner(System.in);
		System.out.print("X = ");
		int n1 = scan.nextInt();
		System.out.print("Y = ");
		int n2 = scan.nextInt();
		// 運算
		int n3 = n1 + n2;
		int n4 = n1 - n2;
		int n5 = n1 * n2;
		int n6 = n1 / n2; // int是整數除，出來的值沒有小數點
		int n7 = n1 % n2; // %是取餘數
		// 輸出
		System.out.printf("%d + %d = %d\n", n1, n2, n3);
		System.out.printf("%d - %d = %d\n", n1, n2, n4);
		System.out.printf("%d * %d = %d\n", n1, n2, n5);
		System.out.printf("%d / %d = %d\n", n1, n2, n6);
		System.out.printf("%d / %d = ...%d\n", n1, n2, n7);
	}
}
