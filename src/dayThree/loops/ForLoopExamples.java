package dayThree.loops;

public class ForLoopExamples {
	public static void main(String[] args) {
/*
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
*/
		ForLoopExamples fle = new ForLoopExamples();
		System.out.println(fle.SumofAll(10));
		fle.fibonacci(7);
	}

	public int SumofAll(int number) {
		int total = 0;
		for (int i = 0; i <= number; i++) {
			total = total + i;
		}
		return total;
	}
	
	public void fibonacci(int number) {
		int num1=0, num2=1;
		for(int i=1; i<=number; ++i) {
			System.out.println(num1 + " ");
			int sumOfPreTwo = num1+ num2;
			num1 = num2;
			num2 = sumOfPreTwo;
		}
	}
}
