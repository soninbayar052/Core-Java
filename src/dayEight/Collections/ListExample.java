package dayEight.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<>();
		list.add("Steve");
		list.add("Tim");
		list.add("Pat");
		list.add("Steve");
		list.add("Tim");
		list.add("Pat");
		list.add("Steve");
		list.add("Tim");
		list.add("Pat");
			
		list1.add("Angela");
		list1.add("Tom");
		list1.add("George");
		
		System.out.println(list + " - " + list1);
		
		// default value ArrayList 10 + 10
		// linked default value 8 + 8

	}
}
