package dayFour.OOP;

public class Inheritance extends child{
	public static void main(String[] args) {
		Inheritance test = new Inheritance();
		System.out.println(test.sumOfAll());
	}
	
	
}

class child{
	int num1=10,num2=20;
	public int sumOfAll() {
		return num1+num2;
	}
}
