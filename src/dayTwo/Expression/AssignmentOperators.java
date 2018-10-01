package dayTwo.Expression;

//Assign operators in java =, +=,-=,*=, /=, %=;
public class AssignmentOperators {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;

		num2 += num1;
		System.out.println(num2);

		num2 -= num1;
		System.out.println(num2);

		num2 /= num1;
		System.out.println(num2);

		num2 *= num1;
		System.out.println(num2);

		num2 %= num1;
		System.out.println(num2);
	}

}
