package dayEight.Collections;

import java.util.Arrays;

public class Interview {

	public static void main(String[] args) {
		Interview obj = new Interview();
		System.out.println(Arrays.toString(obj.Inter(new int[] { 1, 4, 7 })));
		System.out.println(Arrays.toString(obj.Inter(new int[] { 123,-2,477,3,14,6551})));
	}

	public int[] Inter(int[] input) {

		if (input.length == 1) {
			return input;
		} else {
			int value = input[0];
			for (int i = 1; i < input.length; i++) {
				input[i] = input[i] + value;
			}
			int n = input.length - 1;
			int[] newArray = new int[n];
			System.arraycopy(input, 1, newArray, 0, n);
			return Inter(newArray);
		}

	}

}
