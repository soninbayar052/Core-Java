package dayEight.Collections;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMaps {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(5, "A");
		hmap.put(11, "C");
		hmap.put(4, "Z");
		hmap.put(77, "Y");
		hmap.put(9, "P");
		hmap.put(66, "Q");
		hmap.put(0, "R");
		System.out.println(hmap);
		Map<Integer,String> map = new TreeMap<>(hmap);
		System.out.println(map);
		

	}
}
