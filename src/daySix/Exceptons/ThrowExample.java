package daySix.Exceptons;

public class ThrowExample {
	public static void main(String[] args) {
		checkEligibilty(15,50);
	}

	static void checkEligibilty(int stuAge, int stuWight) {
		if (stuAge < 12 && stuWight < 40) {
			throw new ArithmeticException("Students is not eligible");
		} else {
			System.out.println("Student Eligible");
		}
	}

}
