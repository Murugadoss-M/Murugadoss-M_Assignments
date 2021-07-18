package co.mmdoss;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Assignment_4_7 {
	public static void main(String[] args) {
		StringBuilder result=new StringBuilder();
		Map<Integer, String> map= new TreeMap<>();
		map.put(1, "Happy");
		map.put(2, "Birthday");
		map.put(3, "To");
		map.put(4, "You");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		entrySet.forEach(a->result.append(a));
		System.out.println(result);
	}
}
