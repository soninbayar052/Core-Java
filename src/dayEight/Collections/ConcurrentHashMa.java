package dayEight.Collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMa {
	public static void main(String[] args) {

		ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

		map.put(200, 400);
		map.put(300, 400);
		map.put(600, 400);
		map.put(700, 400);
		
		System.out.println(map);
		
		map.replace(600, 900);
		
		System.out.println(map);
	}
}
