package tw.com.ispan.first;

import tw.com.ispan.second.bike;

public class a30 {

	public static void main(String[] args) {
		String s1 = new String("abcdefg");
		String s2 = "abcdefg";// 只要雙引號包起來就是物件
		String s3 = "abcdefg";
		String s4 = new String("abcdefg");
		System.out.println(s4 == s1);
		// 有new是新的，所在的位置是不一樣的
		System.out.println(s1.equals(s2));
		// equals是字串內容是否相同，跟==是不一樣的

		bike b1 = new bike();
		bike b2 = new bike();
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}

}
//1.String字串教學，2.比對有new沒有new的字串是否相同，3.equals說明