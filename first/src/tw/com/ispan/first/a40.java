package tw.com.ispan.first;

import java.util.HashMap;
import java.util.Set;

public class a40 {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("name", "a");
		map.put("gender", false);
		map.put("weight", 79);
		System.out.println(map.get("weight"));
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.printf("%s => %s\n", key, map.get(key));
		}
	}

}
