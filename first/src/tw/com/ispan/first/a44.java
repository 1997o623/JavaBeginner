package tw.com.ispan.first;

import java.io.File;

public class a44 {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\user\\Desktop\\123\\456.txt");
		if (!f1.exists())
			;
		{
			f1.mkdir();// 產生子目錄
		}
	}

}
