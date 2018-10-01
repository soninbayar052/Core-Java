package dayThree.loops;

public class ForEachLoop {
	public static void main(String[] args) {
		int []array1 = {23,45,67,89,22};
		
		String []Array2= {"HEllo", "My","name","is","John."};
		
		for(int i=0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		for(int num: array1) {
			System.out.println("For each loop : " +num);
		}
		
		
		for(String str: Array2) {
			System.out.println(str);
		}
		
	}

}
