package dayTwo.ControlFlow;

public class ControlFlow {

	/*
	 * 1. if statement 2. nested if statement 3. if else statements 4. if else if
	 * statements
	 */

	public static void main(String[] args) {
		ControlFlow cf = new ControlFlow();
		cf.getOne();
		cf.nestedIf();
		cf.ifElseStatements();
		cf.IfElseIfExample();

	}

	public void getOne() {
		int num = 90;

		if (num < 100) {
			System.out.println("Number is less than 100");
		} else {
			System.out.println("Number is greater than 100");
		}
	}

	public void nestedIf() {
		int num = 70;
		if (num < 100) {
			System.out.println("The number is less than 100");

			if (num > 50) {
				System.out.println("number is greater than 50");
			}
		}
	}
	
	public void ifElseStatements() {
		int num = 120;
		if(num<50) {
			System.out.println("num is less than 50");
		}else {
			System.out.println("num is greater than 50");
		}
	}
	
	public void IfElseIfExample() {
		int num1=1234;
		
		if(num1<100 && num1>= 1) {
			System.out.println("its two digit numbers");
		}else if(num1 <1000 && num1 >=100) {
			System.out.println("this is thre digit numbers");
		} else if(num1 < 10000 && num1 >=1000) {
			System.out.println("this is four digit numbers");
		} else if(num1 <100000 && num1 >=10000) {
			System.out.println("this is five digit numbers");
			
			
		}else {
			System.out.println("number is not between 1 & 99999");
		}
	}
	

}
