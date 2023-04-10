package tw.com.ispan.first;

import javax.swing.JOptionPane;

public class a05 {

	public static void main(String[] args) {
		// 輸入
		String n1 = JOptionPane.showInputDialog("請輸入X = ");
		int n3 = Integer.parseInt(n1);
		String n2 = JOptionPane.showInputDialog("請輸入Y = ");
		int n4 = Integer.parseInt(n2);
		// 運算
		int n5 = n3 + n4;
		// 輸出
		JOptionPane.showMessageDialog(null, n5);
	}

}