package dayFour.OOP;

class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
}

public class OverRideExample extends Animal{
public void eat() {
	System.out.println("Dog is eating");
}

public static void main(String[] args) {
	OverRideExample one = new OverRideExample();
	one.eat();
	
	Animal obj = new Animal();
	obj.eat();
}
}
