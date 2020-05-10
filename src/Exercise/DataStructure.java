package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class DataStructure {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("aaaaa");
		list.add("bbbb");
		list.add("dddd");
		list.add("ccccc");

		list.add("qqqq");

		list.add("aabb");

		Collections.sort(list, Collections.reverseOrder());

//		System.out.println(list.toString());

		Hashtable<String, String> table = new Hashtable<String, String>();
		HashMap<String, String> map = new HashMap<String, String>();
		table.put("b", "guny");
		table.put("a", "daseul");
		table.put("c", "minsu");
		table.put("d", "sunwoo");
		
		map.put("b", "guny");
		map.put("a", "daseul");
		map.put("c", "minsu");
		map.put("d", "sunwoo");
		Set<String> table_set = table.keySet();

		System.out.println("Table");
		for (String key : table_set) {
			System.out.println("k: " + key + " v: " + table.get(key));
		}

		Set<String> map_set = map.keySet();

		System.out.println("-----");
		System.out.println("map");
		for (String key : map_set) {
			System.out.println("k: " + key + " v: " + map.get(key));
		}

	}

}
