package dayFour.OOP;

class SuperClass {
	public SuperClass() {
		System.out.println("This is Super Class");
	}

	void display() {
		System.out.println("Super Class Method thou");
	}
}

public class JavaExampleOne extends SuperClass {
	public JavaExampleOne() {
		System.out.println("Child Class Constructor");
	}
	
	void display() {
		System.out.println("Child Class Method thou");
		super.display();
	}
	
	
	
	public static void main(String[] args) {
		JavaExampleOne obj1 = new JavaExampleOne();
		obj1.display();
	}
}

//1. Single Inheritance
//2. Multiple Inheritance
//3. MultiLevel Inheritance
//4. Hybrid
//5. What is method overloading and OverRiding with example of code