package secondWeek;

public class CustomeException2 {
	public static void main(String[] args) {
		CustomeException2 obj1 =new CustomeException2();
		
		try {
			obj1.productCheck(60);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught Exceptions");
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	void productCheck(int weight) throws InvalidProductException{
		if(weight<100) {
			throw new InvalidProductException("Product is invalid");
		}
	}
}

class InvalidProductException extends Exception {
	public InvalidProductException(String s) {
		super(s);
	}
}
