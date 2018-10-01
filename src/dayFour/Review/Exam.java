package dayFour.Review;

import java.util.Arrays;


public class Exam {
	public static void main(String[] args) {
		int[] numbers = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		String[] words = { "java", "Python", "PHP", "C#", "C PRogrammung", "C++" };
		String[] dublicated = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu", "jude" };

		Exam ex1 = new Exam();
		ex1.PrintArrays(numbers);
		ex1.SortArrays(numbers);
		ex1.PrintStringArrays(words);
		ex1.SOrtedPrintStringArrays(words);
		ex1.PrintDublicated(dublicated);

		//Scanner scan = new Scanner(System.in);
		// System.out.println("Please enter number stairs you want :");
		// ex1.PrintStairs(scan.nextInt());
		// scan.close();

		ex1.SmallorLarge(-0.5f);

		// int[] arr =new int[4];
		/// for(int i=0; i<4;i++) {
		// .out.println("Please enter your " +(i+1) + " value");
		// arr[i]=scan.nextInt();
		// }
		// ex1.CheckValues(arr);

		String str1 = "The quick brown fox jumps over the lazy dog";
		String str2 = str1.replace("fox", "cat");
		System.out.println(str2);
	}

	public void CheckValues(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] != numbers[i + 1]) {
				System.out.println("NUmbers are not equal!");
				break;
			} else {
				System.out.println("numbers are equal");
			}
		}
	}

	public void SmallorLarge(float num) {

		if (num != 0) {
			System.out.println(0);

			if (num < 0) {
				System.out.print("negative");
			} else {
				System.out.print("Positive");
			}

			if (num < 1) {
				System.out.println(" small");
			}
			if (num > 1000000) {
				System.out.println(" large");
			}
		} else {
			System.out.println(0);
		}
	}

	public void PrintStairs(int num) {

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public void PrintDublicated(String[] words) {
		for (int i = 0; i < words.length; i++) {

			for (int a = i + 1; a < words.length; a++) {
				if (words[i].equals(words[a]) && i != a) {

					System.out.println("Dublicated Elements are : " + words[a]);

				}
			}
		}
	}

	public void PrintStringArrays(String[] words) {

		System.out.println(Arrays.toString(words));
	}

	public void SOrtedPrintStringArrays(String[] words) {
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));

	}

	public void PrintArrays(int[] numbers) {

		System.out.println(Arrays.toString(numbers));
	}

	public void SortArrays(int[] numbers) {
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
