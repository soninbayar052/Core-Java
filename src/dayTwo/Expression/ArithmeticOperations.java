package dayTwo.Expression;
import java.util.*;


// Basic Arithmetic operators are :+,-,*,/,%
public class ArithmeticOperations {

	public static void main(String[] args) {
		
		int num1,num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		num1 = scan.nextInt();
		System.out.println("Please enter number 2: ");
		num2 = scan.nextInt();
		scan.close();
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2));
		
	}
	
	
}
