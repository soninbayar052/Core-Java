package daySix.Exceptons;

public class ExampleTwo {
	public static void main(String[] args) {
		try {
			int[] a = new int[7];
			a[10] = 30;
		} 
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outside of range of array");
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Something wrong");
		}
	}

}
