package dayTwo.Expression;

//we have six relational operator in java: ==, !=, > .< , >= , <=;
public class ComparisonOperator {

	public static void main(String[] args) {
		int num1 = 10, num2 = 50;

		if (num1 == num2) {
			System.out.println("num1 and num2 are same");
		} else {
			System.out.println("num1 and num2 are not same");
		}

		if (num1 != num2) {
			System.out.println("num1 and num2 are same");
		} else {
			System.out.println("num1 and num2 are not same");
		}

		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		} else {
			System.out.println("num2 is greater than num1");
		}

		if (num1 >= num2) {
			System.out.println("num1 is greater than num2 or equal");
		} else {
			System.out.println("num2 is greater than num1 or equal");
		}

		if (num1 < num2) {
			System.out.println("num2 greater than num1 ");
		} else {
			System.out.println("num1 and num2 are not same");
		}
		if (num1 <= num2) {
			System.out.println("num1 and num2 are same");
		} else {
			System.out.println("num1 and num2 are not same");
		}
	}
}
