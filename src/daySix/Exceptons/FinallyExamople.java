package daySix.Exceptons;

public class FinallyExamople {
	public static void main(String[] args) {
		try {
			int num = 123 / 0;
		} catch (ArithmeticException e) {
			System.out.println("An Aritmetic exception");
		}

		finally {
			// TODO: handle finally clause
			System.out.println("This is finaly block");
		}

		System.out.println("Out of Try catch block");
	}
}
