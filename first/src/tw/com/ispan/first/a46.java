package tw.com.ispan.first;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a46 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("./dir1/file1.txt");

			int c1;
			while ((c1 = fin.read()) != -1) {
				System.out.print((char) c1);
			}
			fin.close();
			// } catch(FileNotFoundException e) {
			// System.out.println("file not found:"+ e.toString());
			// 因為下面已經有IOEX，所以上面這個FILE可以不用做，都給IOEX來審核
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
//只要是XXX STREAM，都是以BYYE為單位讀取