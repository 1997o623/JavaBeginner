package tw.com.ispan.first;

public class a06 {

	public static void main(String[] args) {
		int a = 126, b = 4;
		long c = (short) (a + b); // ()強制轉型
		System.out.println(c);
		System.out.println("-------------");
		byte d = -127;
		d--;
		d--;
		d++;
		System.out.println(d);

	}

}
