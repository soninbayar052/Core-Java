package dayTwo.Expression;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter 3 integer : ");
		
		Scanner scan = new Scanner(System.in);
		int num1,num2,num3, max;
		
		num1= scan.nextInt();
		num2= scan.nextInt();
		num3 = scan.nextInt();
		
		max = (num1 >num2)? num1:num2;
		System.out.println((max > num3)?max:num3);
		
		scan.close();
	}

}
