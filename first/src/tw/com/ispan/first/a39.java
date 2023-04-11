package tw.com.ispan.first;

import java.util.ArrayList;

public class a39 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0, 1); // 0
		list.add(0, 2); // 1
		list.add(0, 3); // 1 2
		list.add(0, 4);
		list.add(0, 5);
		System.out.println(list);

	}

}
