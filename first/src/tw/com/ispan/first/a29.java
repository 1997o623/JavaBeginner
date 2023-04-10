package tw.com.ispan.first;

import tw.com.ispan.second.bike;

public class a29 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		// 改寫原本object的string
		System.out.println(s1.length());
		String s2 = null; 
		// 只要有等號，就完成初始化
		// 用null也可以，因為已經宣告
		System.out.println(s2);
		bike b1 = new bike();
		System.out.println(b1);
		System.out.println(s1);

	}

}
//基本api教學