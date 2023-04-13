package tw.com.ispan.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class a52 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		try {
			File source = new File("dir1/view.jpg");
			FileInputStream fin = new FileInputStream(source);
			byte[] buf = new byte[(int) source.length()];
			fin.read(buf);
			fin.close();// 輸入進buf

			FileOutputStream fout = new FileOutputStream("dir1/view4.jpg");
			fout.write(buf);
			fout.flush();
			fout.close();// 從buf輸出
			System.out.println("finish " + (System.currentTimeMillis() - now));

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
//複製貼上換一個比較快的方式 version 3(僅適合2GB以上的檔案)