package tw.com.ispan.first;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class a51 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/view.jpg");
			FileOutputStream fout = new FileOutputStream("dir1/view4.jpg");

			int len;
			byte[] buf = new byte[4096];
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("finish " + (System.currentTimeMillis() - now));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
//複製貼上換一個比較快的方式 version 2