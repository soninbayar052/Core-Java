package dayTwo.ControlFlow;

import java.util.Scanner;

public class ThirdDayTest {

	public static void main(String[] args) {

		int[] numbers = { 15, 100, 100 };

		ThirdDayTest tdt = new ThirdDayTest();
		System.out.println("The Largest Number is : " + tdt.largestNumber(numbers));
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number That is even or Od: ");
		System.out.println("This number OD is : " + tdt.IsNumberOd(scan.nextInt()));
		System.out.println("-----------------------------------------------------");
		System.out.println("Please enter Input That is negative or Possitive");
		System.out.println("This number is negative is : " + tdt.isThisNegativeNumber(scan.nextInt()));
		scan.close();
	}

	public int largestNumber(int[] numbers) {

		int max = 0;

		if (numbers[0] < numbers[1]) {
			max = numbers[1];
		} else if (numbers[0] > numbers[2]) {
			max = numbers[0];
		} else if (numbers[2] > max) {
			max = numbers[2];
		}
		return max;
	}

	public boolean IsNumberOd(int number) {

		boolean result = true;
		if (number % 2 == 0) {
			result = false;
		}
		return result;
	}

	public boolean isThisNegativeNumber(int number) {
		boolean result = false;

		if (number < 0) {
			result = true;
		}
		return result;
	}

}
