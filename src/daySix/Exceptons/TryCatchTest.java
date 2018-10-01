package daySix.Exceptons;

public class TryCatchTest {

	public static void main(String[] args) {
		try {

			System.out.println("First Statement of try block ");

		} finally {
			System.out.println("Finally block");
			int num =0;
			    num =num +123 / 0;
			
		}
	}
}
