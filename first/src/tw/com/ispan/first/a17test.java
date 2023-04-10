package tw.com.ispan.first;

public class a17test {

	public static void main(String[] args) {

		int first = 9;
		int second = 9;

		for (int j = 1; j <= first; j++) {
			for (int i = 2; i <= second; i++) {
				int result = i * j;
				System.out.printf("%d x %d = %d\t", i, j, result);
			}
			System.out.println();
		}

	}
}
