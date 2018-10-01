package dayThree.ControlFlow;

public class MiddleNumberCheck {

	public static void main(String[] args) {

		int[] input1 = { 1, 2, 3, 4, 5 };
		int[] input2 = { 3, 2, 1, 4, 5 };
		int[] input3 = { 3, 2, 1, 4, 1 };
		int[] input4 = { 1, 2, 3, 4 };
		int[] input5 = {};
		int[] input6 = { 10 };
		MiddleNumberCheck mnc = new MiddleNumberCheck();
		System.out.println(mnc.FindNumber(input1));
		System.out.println(mnc.FindNumber(input2));
		System.out.println(mnc.FindNumber(input3));
		System.out.println(mnc.FindNumber(input4));
		System.out.println(mnc.FindNumber(input5));
		System.out.println(mnc.FindNumber(input6));
	}
	public int FindNumber(int[] inputArray) {
		int result = 1;
		if (inputArray.length > 0) {
			if (inputArray.length % 2 == 1) {
				for (int i = 0; i < inputArray.length; i++) {
				
						if (inputArray[i] <= (inputArray[(inputArray.length - 1) / 2])) {
							if (i != (inputArray.length - 1) / 2) {	
							result = 0;
							break;
							}
						}
					}
			} else {
				result = 0;
			}
		} else {
			result = 0;
		}
		return result;
	}
}
