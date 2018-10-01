package dayFive.OOP2;

public class StaticBinding  extends Human{
//static binding also know as early binding ...
	
	public static void walk() {
		System.out.println("Boy  Walks");
	}
	
	public void eat() {
		System.out.println("Boy Eats");
	}
	
	public static void main(String[] args) {
		Human hu = new StaticBinding();
		Human hu1 = new Human();
		
		//hu.walk();
		//hu1.walk();
		hu.eat();
		hu1.eat();
	}
}


class Human{
	public static void walk() {
		System.out.println("Human Walks");
	}
	
public void eat() {
	System.out.println("Human Eats");
}
}