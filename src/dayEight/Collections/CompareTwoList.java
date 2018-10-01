package dayEight.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CompareTwoList {
	public static void main(String[] args) {
		compareTwoList();
	}

	public static void compareTwoList() {
		LinkedList<String> list1 = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "B"));
		LinkedList<String> list2 = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E", "G"));
		Collections.sort(list1);
		Collections.sort(list2);

		boolean isEqual = list1.equals(list2);
		System.out.println(isEqual);

		// list1.removeAll(list2); // compare list
		// System.out.println(list1);

		// list2.remove(list1);
		// System.out.println(list2);

		list1.retainAll(list2); // common element show 2 list
		System.out.println(list1);

		System.out.println(list1.indexOf("B"));
		
		ArrayList<String> sublist = new ArrayList<>(list1.subList(2, 4));
		System.out.println(sublist);
		
	}
}
