package daySix.Exceptons;

public class ExampleException {

	public static void main(String[] args) {
		int num1, num2;
		try {
			num1 = 0;
			num2 = 23 / num1;
			System.out.println(num2);
			System.out.println("this is end of try block");
		} catch (ArithmeticException e) {

			System.out.println("Cannot divide number by zero");

		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occured" + e.getMessage());
		}

		System.out.println("outside of try catch block");
	}

}
