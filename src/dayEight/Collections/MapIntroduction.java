package dayEight.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIntroduction {
	public static void main(String[] args) {
//name of the class (K,V) name of the map new name ofthe map<K,V>();
		HashMap<Integer, String> hasmap = new HashMap<>();
		hasmap.put(1, "Java");
		hasmap.put(2, "C#");
		hasmap.put(3, "Python");
		hasmap.put(4, "JavaScript");
		hasmap.put(5, "CDEQ");
		System.out.println(hasmap);
		// hashmap is key and value

		for (Map.Entry me : hasmap.entrySet()) {
			System.out.println(me.getKey() + " : "+ me.getValue());
		}
		
		Iterator it = hasmap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey()+ " : " +me.getValue() );
		}
	}

}
