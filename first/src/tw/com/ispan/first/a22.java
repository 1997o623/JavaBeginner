package tw.com.ispan.first;

public class a22 {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		a[0] = new int[4];
		a[1] = new int[2];
		a[2] = new int[3];

		a[0][0] = 19;
		a[0][2] = 20;
		a[0][3] = 21;
		a[1][0] = 54;
		a[2][2] = 89;

		for (int[] v : a) { // :就是for each
			for (int vv : v) {
				System.out.println(vv + " ");

			}
			System.out.println();

		}
		System.out.println("----");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] + " ");
			}
		}
	}

}
//教陣列