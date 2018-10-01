package dayFour.OOP;

public class OverLoadedClass {
	int num1;
	int num2;
	String str;
	
	
	
	
	
	public OverLoadedClass() {
		
	}

	public OverLoadedClass(int num1) {
		
	}
	
	public OverLoadedClass(int num1, int num2) {
		
	}
	
	protected void add(int num1, int num2) {
		
	}
}

class OverRideClass extends OverLoadedClass{
	
	void add(double num1, double num2) {
		
	}
	@Override
	public void add(int num1, int num2) {
		
	}
}
