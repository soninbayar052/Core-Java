package daySix.OOP3;

public class InterfaceDemo implements MyInterface,MyInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of method 1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of method 2");
	}
	
	public static void main(String[] args) {
		MyInterface ob1 = new  InterfaceDemo();
		ob1.method1();
		ob1.method2();
		MyInterface2 obj1 = new InterfaceDemo();
		obj1.method3();

		SimpleTestClass cs = new SimpleTestClass();
		cs.methodthree();
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

}

// interface is contract you need to use that method its different from absract class abscract class give you choose but interface no choise
interface MyInterface{
	public void method1();
	public void method2();
}
interface MyInterface2 extends MyInterface{
	public void method3();
}