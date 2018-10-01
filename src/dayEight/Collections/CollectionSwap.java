package dayEight.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionSwap {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
		System.out.println(list);

		Collections.swap(list, 1, 4);

		System.out.println(list);
// thread safe 
		synchronized (list) {
			for (String str : list) {
				System.out.println(str);
			}

		}
	}
}
