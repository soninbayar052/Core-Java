package dayTwo.Expression;

public class TypeCasting {
	
	public static void main(String[] args) {
		// Implicit Casting = Widening the range
		// Explicit Casting = Narrowing the Range
		
		int i = 100;
		long I=i;
		float f =I;
		System.out.println(i);
		System.out.println(I);
		System.out.println(f);
		
		char c = 'c';
		int num =88;
		c = (char) num;
		System.out.println(c);
		
		
		double d= 110.24;
		
		long long1 = (long)d;
		
		System.out.println(long1);
	}

}
