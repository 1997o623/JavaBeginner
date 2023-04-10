package tw.com.ispan.first;

public class a14 {

	public static void main(String[] args) {
		final int a = 19;
		switch (a) { // byte, short, char, int , String
		case 18: // case的值需是常數，若不為常數需在宣告時加final
			System.out.println("A");
			break;
		case a:
			System.out.println("B");
			break;
		case 100:
			System.out.println("C");
			break;
		default:
			System.out.println("X");
		}
		System.out.println("finish");
	}

}
