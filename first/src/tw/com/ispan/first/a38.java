package tw.com.ispan.first;

import java.util.HashSet;
import java.util.Iterator;

public class a38 {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		names.add("a");
		names.add("b");
		names.add("c");
		names.add("d");
		names.add("a");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		System.out.println("-------");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
