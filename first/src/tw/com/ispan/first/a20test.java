package tw.com.ispan.first;

public class a20test {

	public static void main(String[] args) {
		int p0, p1, p2, p3, p4, p5, p6;
		p0 = p1 = p2 = p3 = p4 = p5 = p6 = 0;

		for (int i = 0; i < 100; i++) {
			int rand = (int) (Math.random() * 6 + 1);
			switch (rand) {
			case 1:
				p1++;
				break;
			case 2:
				p2++;
				break;
			case 3:
				p3++;
				break;
			case 4:
				p4++;
				break;
			case 5:
				p5++;
				break;
			case 6:
				p6++;
				break;
			default:
				p0++;
			}
		}
		System.out.printf("0點出現%d次\n", p0);
		System.out.printf("1點出現%d次\n", p1);
		System.out.printf("2點出現%d次\n", p2);
		System.out.printf("3點出現%d次\n", p3);
		System.out.printf("4點出現%d次\n", p4);
		System.out.printf("5點出現%d次\n", p5);
		System.out.printf("6點出現%d次\n", p6);
	}
}
