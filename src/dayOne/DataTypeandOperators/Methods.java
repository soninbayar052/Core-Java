package dayOne.DataTypeandOperators;

public class Methods {
/*
 * every method need 5 things
 * 1. access modifier public private default protected
 * 2. Return Type - primitive, reference data type
 * 3. Name - Method name
 * 4. parameters - list of parameters
 * 5. 
 */
	public static void main(String[] args) {
		System.out.println(minfunction(10,20,30));
		
		Methods m1 = new Methods();
		m1.getNumbers();
	}
	
	
	public static void getNames() {
		System.out.println("This is the get names method");
	}
	
	public static int minfunction(int n1 ,int n2, int n3) {
		
		getNames();
		return n1+n2+n3;		
	}
	
	public void getNumbers() {
		System.out.println(55);
	}
}
