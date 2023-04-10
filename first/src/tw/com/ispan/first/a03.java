package tw.com.ispan.first;

public class a03 {

	public static void main(String[] args) {
		byte n01 = 32, n02 = 64;
		int n03 = n01 + n02;
		// byte,short,int只要做運算都在int或long
		System.out.println(n03);
		long n04 = 64, n05 = 128;
		System.out.printf("%d + %d = %d", n04, n05, n03);
		// printf前面藍色的是格式，後面是數值
	}

}
