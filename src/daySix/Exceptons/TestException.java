package daySix.Exceptons;

public class TestException {
	
	
	public static void main(String[] args) {
		try {
			System.out.println("Inside the block1");
			try {
				int num1=30,num2=0;
				
				System.out.println(num1/num2);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("ArithmeticException");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
		
	}

}
