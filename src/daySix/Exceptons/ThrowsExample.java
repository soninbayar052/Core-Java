package daySix.Exceptons;

public class ThrowsExample {

	public static void main(String[] args) {

		Test sd =new Test();
		sd.myMethod(0);

	}

}

class Test {
	  void myMethod(int num) throws ArithmeticException, NullPointerException {
		if (num == 1) {
			throw new ArithmeticException("ArithmeticException");
		} else {
			throw new NullPointerException("NullPointerException");
		}
	}
}