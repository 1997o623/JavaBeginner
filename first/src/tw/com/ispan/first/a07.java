package tw.com.ispan.first;

public class a07 {

	public static void main(String[] args) {
		// float / double(2^32、2^64不是範圍，是精確度)
		float a = 12.3f; 
		// 如果小數點要用float，要在後面加f
		double b = 12.3; 
		// 小數點預設是double，另12.0非12
		System.out.println(a);
		double c = a + b;
		System.out.println(c);
		// 實戰比較常用double
	}

}
