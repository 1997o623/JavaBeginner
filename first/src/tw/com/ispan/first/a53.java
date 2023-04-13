package tw.com.ispan.first;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class a53 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		try (FileInputStream fin = new FileInputStream("dir1/view.jpg");
				FileOutputStream fout = new FileOutputStream("dir1/view4.jpg");) {
			// 重點，在try後面加上刮號把敘述句放進去(但裡面裝的不可以有其他句，只能加可以自動關閉的句子)
			// 如果在IN OUT中間要做其他的作業，就不要使用自動關閉
			int len;
			byte[] buf = new byte[4096];
			while ((len = fin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			System.out.println("finish " + (System.currentTimeMillis() - now));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
//自動關閉的語法