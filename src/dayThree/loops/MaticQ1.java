package dayThree.loops;

public class MaticQ1 {

	public static void main(String[] args) {
		int[] numbers = { 2, 3, 3,4,5,6};

		MaticQ1 mtc1 = new MaticQ1();

		for (int num : mtc1.CheckNumber(numbers)) {
			System.out.println(num);
		}

	}

	public int[] CheckNumber(int[] inputArray) {

		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[i] == 2 && inputArray[i + 1] == 3) {
				inputArray[i + 1] = 0;
			}
		}
		return inputArray;
	}
}
