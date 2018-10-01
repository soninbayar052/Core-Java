package secondWeek;

public class ExceptionExample3 {

	public static void main(String[] args) {
		try {
			int a = 24 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			// TODO: handle exception
		}
		try {
			int arr[] = { 1, 2, 3, 4 };
			int b = arr[9];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			// TODO: handle exception
		}

		try {
			int num = Integer.parseInt("XYZ");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("NumberFormatException");
		}
		try {
			String Sarr = "hello world";
			char b = Sarr.charAt(40);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			// TODO: handle exception
		}

		try {
			String Str = null;
			int a = Str.length();
		} catch (NullPointerException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			// TODO: handle exception
		}

	}

}
