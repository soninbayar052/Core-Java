package dayFive.OOP2;

public class AbsractClass extends Animal {
//absract
	// you can not create an instance out the absract class
	// Abstract class  force needs to do use that method
	public static void main(String[] args) {
		AbsractClass am = new AbsractClass();
		am.eat();
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog is Barking");
		
	}

	@Override
	public int addAll(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

abstract class Animal{
	public abstract void sound();
	public abstract int addAll(int num1, int num2);
	
	void eat() {
		System.out.println("Animal Eating..");
	}
	
}