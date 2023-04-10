package tw.com.ispan.first;

public class a15test {

	public static void main(String[] args) {
		double a = Math.random();
		final int date = (int) (a * 12) + 1;
		switch (date) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.printf("%d月有31天", date);
			break;
		case 2:
			System.out.printf("%d月有28天", date);
			break;
		case 4, 6, 9, 11:
			System.out.printf("%d月有30天", date);
			break;
		}

	}

}
