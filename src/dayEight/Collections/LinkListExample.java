package dayEight.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkListExample {
	
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<>();
		
		linkedlist.add("Falls CHurch");
		linkedlist.add("MACLEAN");
		linkedlist.add("DC");
		System.out.println(linkedlist);
		System.out.println(linkedlist.size());
		
		linkedlist.add(1, "Alexandria");
		System.out.println(linkedlist);
		
		for(String str : linkedlist) {
			System.out.println(str);
		}
		Iterator<String> it = linkedlist.iterator();
		
		while( it.hasNext()) {
			System.out.println("This is next elements: "  +it.next());
		}
		
		
		Vector<String> vector = new Vector<>();
		
		
		
	}

}
