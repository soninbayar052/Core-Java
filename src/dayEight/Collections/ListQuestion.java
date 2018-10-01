package dayEight.Collections;

import java.util.ArrayList;

public class ListQuestion {
	public static void main(String[] args) {
		
		
		
		ListMergeExample();
		
		ArrayList<Integer> listIn = new ArrayList<>();
		System.out.println("Initial size: " + listIn.size());
		listIn.add(10);
		listIn.add(11);
		listIn.add(1);
		listIn.add(45);
		listIn.add(99);
		System.out.println("Size After few additions: " + listIn.size());
		listIn.remove(0);
		listIn.remove(1);
		System.out.println("Size after remove operations: " + listIn.size());
		for (int i : listIn) {
			System.out.println(i);
		}
	}
	
	
	public static void ListMergeExample() {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(6);
		list1.add(7);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(51);
		list1.add(61);
		list1.add(17);
		
		list1.addAll(list2);
		System.out.println(list1);	
	}
	
	
	public static void DuplicateList() {
		ArrayList<String> list3 = new ArrayList<>();
		ArrayList<String> list4 = new ArrayList<>();
		list3.add("hello");
		list3.add("world");
		list3.add("john");
		
		list4.add("hello");
		list4.add("world");
		list4.add("john");
		list4.add("Edited");
		list4.add("film");
		
		
	}
}
