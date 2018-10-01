package secondWeek;

public class CustomeExceptions {
	public static void main(String[] args) {
		try {
			System.out.println("Try Chatch BLock");
			throw new MyException("This is error message");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is catch block message");
			System.out.println(e);
		}
		System.out.println("Outstide try catch block");
	}

}

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str1;

	public MyException(String str2) {
		this.str1 = str2;
	}

	@Override
	public String toString() {
		return "MyException [str1=" + str1 + "]";
	}

}