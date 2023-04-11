package tw.com.ispan.first;

import tw.com.ispan.second.scooter;

public class a41 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		int c;

		try {
			c = a / b;
			System.out.println(c);
			int[] d = { 1, 2, 3, 4 };
			System.out.println(d[3]);
			scooter b1 = null;
			b1.speedup();

		} catch (ArithmeticException e) {
			System.out.println("出錯1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("出錯2");
		} catch (NullPointerException e) {
			System.out.println("出錯3");
		} catch (RuntimeException e) {
			System.out.println("出錯4");
		}

		System.out.println("gameover");
	}

}
