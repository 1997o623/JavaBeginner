package tw.com.ispan.first;

import java.util.HashSet;

import tw.com.ispan.second.bike;

public class a37 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("a37");
		set.add(new bike());
		set.add(19);
		set.add(19.9);
		set.add("a37"); // hashSet不可重覆，所以這個沒有set進去
		set.add(123);
		System.out.println(set.size());
		System.out.println(set);
	}
}
