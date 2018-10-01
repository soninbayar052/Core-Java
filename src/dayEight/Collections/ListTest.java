package dayEight.Collections;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ListMergeExample();
	}
	
	public static void ListMergeExample() {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(8);
		list2.add(9);
		
		for(int i =0; i < list1.size(); i++) {
			for(int j=0; j<list2.size();j++) {
				if(list1.get(i)==list2.get(j)) {
					list2.remove(j);
				}
			}
		}
		list1.addAll(list2);
		System.out.println(list1);
		
	}
}

