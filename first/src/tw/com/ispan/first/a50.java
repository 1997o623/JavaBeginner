package tw.com.ispan.first;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class a50 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		try {
			FileInputStream fin = new FileInputStream("dir1/view.jpg");
			FileOutputStream fout = new FileOutputStream("dir1/view3.jpg");
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);
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
//複製貼上