package tw.com.ispan.first;

public class a21 {

	public static void main(String[] args) {
		int[] p = new int[7]; // p[0]=0~p[6]=0

		{
			for (int i = 0; i < 100; i++) {
				int rand = (int) (Math.random() * 6 + 1);
				p[rand]++;
			}
			for (int i = 1; i <= 6; i++) {
				System.out.printf("%d點出現%d次\n", i, p[i]);
			}

			System.out.println("------");
			// 第一種
			for (int i = 0; i < p.length; i++) {
				System.out.println(p[i]);
			}

			System.out.println("------");
			// 第二種
			for (int v : p) {
				// 跑裡面所有元素
				System.out.println(v);
			}
		}
	}
}
