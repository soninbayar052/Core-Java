package dayThree.loops;

public class WhileLoop {
	public static void main(String[] args) {
		int i =10;
		while(i >1) {
			System.out.println(i);
			i--;
			
		}
		whileLoopWithArray();
	}
	
	public static void whileLoopWithArray() {
		int [] array2 = {12,123,34,43,23};
		int i=0;
		while(i < array2.length) {
		
		System.out.println(array2[i]);
		i++;
		}
	}

}
