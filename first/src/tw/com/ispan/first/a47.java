package tw.com.ispan.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a47 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./dir1/file1.txt");
			int len;
			byte[] buf = new byte[3];
			while ((len = fin.read(buf)) != -1) {
				System.out.print(new String(buf, 0, len));
			}
			fin.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
//建立