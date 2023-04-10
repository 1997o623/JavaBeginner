package tw.com.ispan.first;

public class a13 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		if (++a > 10 | b-- < 3) // &&(and)，||(or)、|(類or)
			System.out.printf("ok, a = %d, b = %d", a, b);

		else
			System.out.printf("xx, a = %d, b = %d", a, b);
	}
}
