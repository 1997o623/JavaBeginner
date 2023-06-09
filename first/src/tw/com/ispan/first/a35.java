package tw.com.ispan.first;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class a35 extends JFrame implements ActionListener {
	private JButton b1, b2, b3;

	public a35() {

		b1 = new JButton("b1");
		b2 = new JButton("b2");
		b3 = new JButton("b3");

		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String eventString = e.getActionCommand();
		if (e.getSource() == b1) {
			doB1();
		} else if (e.getSource() == b2) {
			doB2();
		} else if (e.getSource() == b3) {
			doB3();
		}
	}

	private void doB1() {
		System.out.println("B1");
	}

	private void doB2() {
		System.out.println("B2");
	}

	private void doB3() {
		System.out.println("B3");
	}

	public static void main(String[] args) {
		new a35();
	}
}