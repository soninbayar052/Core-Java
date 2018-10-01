package dayFive.OOP2;

public class Demo {
//this class in an example of static or dynamic polymorphism
	
	public static void main(String[] args) {
		SimpleCalculator sc = new SimpleCalculator();
		System.out.println(sc.add(10, 20));
		System.out.println(sc.add(10, 20,30));
	}
	
	
}

class SimpleCalculator{
	int add(int a,int b) {
		return a+b;
	}
	
	int add(int a, int b, int c) {
		return a+b+c;
	}
}