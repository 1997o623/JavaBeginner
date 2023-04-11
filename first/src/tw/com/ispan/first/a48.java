package tw.com.ispan.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class a48 {

	public static void main(String[] args) {
		String data = "123456";
		try {
			FileOutputStream fout = new FileOutputStream("./dir2");
			fout.write(data.getBytes());
			fout.flush();
			fout.close();
			System.out.println("ok");
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
//讀出來