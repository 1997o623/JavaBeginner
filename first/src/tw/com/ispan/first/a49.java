package tw.com.ispan.first;

import java.io.FileReader;
import java.io.IOException;

public class a49 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/file1.txt");
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
			reader.close();
			System.out.print("ok");
		} catch (IOException e) {
			System.out.print(e);
		}
	}

}
